package com.example.leado

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.leado.models.PlayListResponse
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
private val apiInterface0: APIInterface = APIClient.getRetrofit().create(APIInterface::class.java)

class JourneyHomeFragment : Fragment(), View.OnClickListener {

    val journeyHomeFragmentArgs: JourneyHomeFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_journey_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        lessons_recycler_view.layoutManager = LinearLayoutManager(this.context,LinearLayoutManager.HORIZONTAL,false)
        callApi()
    }

    private fun callApi() {
        apiInterface0.getPlayListID(BuildConfig.APIKEY,journeyHomeFragmentArgs.ButtonName).enqueue(object : Callback<PlayListResponse> {
            override fun onFailure(call: Call<PlayListResponse>, t: Throwable) {
                Log.e("on failure", t.message.toString())
            }

            override fun onResponse(call: Call<PlayListResponse>, response: Response<PlayListResponse>) {

                if (response.isSuccessful) {
                    Log.e("Success", "data loaded successfully")
//                    val items = response.body()!!.items
                } else {
                    Log.e("error", "can't bind data")
                }
            }
        })
        apiInterface.getVideos(BuildConfig.APIKEY,"").enqueue(object : Callback<VideoResponse> {
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

    override fun onClick(v: View?) {
        when(v){
            icon_1,subject_button_1 -> {}
            icon_2,subject_button_2 -> {}
            icon_3,subject_button_3 -> {}
            icon_4,subject_button_4 -> {}
        }
    }

}
