package com.example.leado

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.leado.data.models.VideoResponse
import com.example.leado.data.models.Videos
import com.example.leado.data.remote.APIClient
import com.example.leado.data.remote.APIInterface
import com.example.leado.data.repositories.CourseRepository
import kotlinx.android.synthetic.main.fragment_journey_home.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * A simple [Fragment] subclass.
 */

class JourneyHomeFragment : Fragment(), View.OnClickListener {

    private val journeyHomeFragmentArgs: JourneyHomeFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_journey_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        lessons_recycler_view.layoutManager = LinearLayoutManager(this.context,LinearLayoutManager.HORIZONTAL,false)
        callingApi()
        icon_1.setOnClickListener(this)
        icon_2.setOnClickListener(this)
        icon_3.setOnClickListener(this)
        icon_4.setOnClickListener(this)
        subject_button_1.setOnClickListener(this)
        subject_button_2.setOnClickListener(this)
        subject_button_3.setOnClickListener(this)
        subject_button_4.setOnClickListener(this)
    }
    private fun callingApi(){
        CourseRepository.callApi(journeyHomeFragmentArgs.playListID).observe(viewLifecycleOwner, Observer {
            populateRecycler(it)
        })
    }

    private fun populateRecycler(videoList: List<Videos>){

        lessons_recycler_view.adapter = CourseAdapter(videoList)
    }

    override fun onClick(v: View?) {
        when(v){
            icon_1,subject_button_1 -> {callingApi()}
            icon_2,subject_button_2 -> {callingApi()}
            icon_3,subject_button_3 -> {callingApi()}
            icon_4,subject_button_4 -> {callingApi()}
        }
    }

}
