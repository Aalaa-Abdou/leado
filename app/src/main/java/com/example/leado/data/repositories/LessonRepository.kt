package com.example.leado.data.repositories

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.leado.BuildConfig
import com.example.leado.data.models.VideoResponse
import com.example.leado.data.models.Videos
import com.example.leado.data.remote.APIClient
import com.example.leado.data.remote.APIInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object LessonRepository {

    private val apiInterface: APIInterface = APIClient.getRetrofit().create(APIInterface::class.java)

    private val CourseMutableLiveData: MutableLiveData<List<Videos>> = MutableLiveData()

     fun callApi(playListId: String): LiveData<List<Videos>> {

        apiInterface.getVideos(BuildConfig.APIKEY,playListId).enqueue(object :
            Callback<VideoResponse> {
            override fun onFailure(call: Call<VideoResponse>, t: Throwable) {
                Log.e("on failure", t.message.toString())
            }

            override fun onResponse(call: Call<VideoResponse>, response: Response<VideoResponse>) {

                if (response.isSuccessful) {
                    Log.e("Success", "data loaded successfully")
                    CourseMutableLiveData.postValue(response.body()!!.items)
                } else {
                    Log.e("error", "can't bind data")
                }
            }
        })
         return CourseMutableLiveData
    }

}