package com.example.leado

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.navigation.fragment.findNavController
import com.example.leado.data.models.Course
import com.example.leado.data.repositories.CourseRepository
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment(), View.OnClickListener {

    private lateinit var bottomNavBar: View
    private var coursesList: List<Course> = listOf()
    private var gson = Gson()
    private lateinit var jasonString: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bottomNavBar = activity?.findViewById(R.id.bottom_navigation_bar)!!
        bottomNavBar.visibility = View.VISIBLE
        val toolbar = requireActivity().findViewById<Toolbar>(R.id.tool_bar)
        toolbar.visibility = View.GONE

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        course_button_1.setOnClickListener(this)
        course_button_2.setOnClickListener(this)
        course_button_3.setOnClickListener(this)

        coursesList = CourseRepository.getCourse()

        initCoursesNames()
    }

    private fun initCoursesNames() {
        course_button_1.text = coursesList[0].courseName
        course_button_2.text = coursesList[1].courseName
        course_button_3.text = coursesList[2].courseName
    }

    override fun onClick(v: View?) {
        when(v){
            course_button_1 -> {
                jasonString = gson.toJson(coursesList[0])
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToJourneyHomeFragment(jasonString))
                bottomNavBar.visibility = View.GONE
            }
            course_button_2 -> {
                jasonString = gson.toJson(coursesList[1])
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToJourneyHomeFragment(jasonString))
                bottomNavBar.visibility = View.GONE
            }
            course_button_3 -> {
                jasonString = gson.toJson(coursesList[2])
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToJourneyHomeFragment(jasonString))
                bottomNavBar.visibility = View.GONE
            }
        }
    }

}
