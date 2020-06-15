package com.example.leado

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.leado.models.Subject
import com.example.leado.models.VideoResponse
import com.example.leado.models.Videos
import com.example.leado.remote.APIClient
import com.example.leado.remote.APIInterface
import kotlinx.android.synthetic.main.fragment_journey_home.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * A simple [Fragment] subclass.
 */
private val apiInterface: APIInterface = APIClient.getRetrofit().create(APIInterface::class.java)

class JourneyHomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_journey_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        lessons_recycler_view.layoutManager = LinearLayoutManager(this.context,LinearLayoutManager.HORIZONTAL,false)

        apiInterface.getVideos(BuildConfig.APIKEY).enqueue(object : Callback<VideoResponse> {
            override fun onFailure(call: Call<VideoResponse>, t: Throwable) {
                Log.e("on failure", t.message.toString())
            }

            override fun onResponse(call: Call<VideoResponse>, response: Response<VideoResponse>) {

                if (response.isSuccessful) {
                    Log.e("Success", "data loaded successfully")
                    populateRecycler(response.body()!!.items)
                } else {
                    Log.e("error", "can't bind data")
                }
            }
        })
    }
    private fun populateRecycler(videoList: List<Videos>){

        lessons_recycler_view.adapter = CourseAdapter(videoList)
    }

}
