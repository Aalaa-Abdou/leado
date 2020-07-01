package com.example.leado

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.leado.data.models.Course
import com.example.leado.data.models.Subject
import com.example.leado.data.repositories.CourseRepository
import kotlinx.android.synthetic.main.fragment_journey_home.*

/**
 * A simple [Fragment] subclass.
 */

class JourneyHomeFragment : Fragment(), View.OnClickListener {


    private val journeyHomeFragmentArgs: JourneyHomeFragmentArgs by navArgs()

    var subjectList: List<Subject> = listOf()

    private lateinit var courseObject: Course


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        courseObject = CourseRepository.getCourse()[journeyHomeFragmentArgs.CourseID - 1]
        return inflater.inflate(R.layout.fragment_journey_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        course_name_TV.text = courseObject.courseName

        course_name_recycler_TV.text = courseObject.courseName

        lessons_recycler_view.layoutManager = LinearLayoutManager(this.context,LinearLayoutManager.HORIZONTAL,false)

        accessingRepository(courseObject.courseId,courseObject.Subjects[0].subjectId)

// initializing the subjects icons and titles can be done with a recycler View
        subjectList = courseObject.Subjects

        initSubjectsNamesAndIcons()

        icon_1.setOnClickListener(this)
        icon_2.setOnClickListener(this)
        icon_3.setOnClickListener(this)
        icon_4.setOnClickListener(this)
        subject_button_1.setOnClickListener(this)
        subject_button_2.setOnClickListener(this)
        subject_button_3.setOnClickListener(this)
        subject_button_4.setOnClickListener(this)
    }

    private fun initSubjectsNamesAndIcons() {
        icon_1.setImageResource(subjectList[0].subjectIcon[0].Icon)
        icon_2.setImageResource(subjectList[1].subjectIcon[0].Icon)
        icon_3.setImageResource(subjectList[2].subjectIcon[0].Icon)
        icon_4.setImageResource(subjectList[3].subjectIcon[0].Icon)
        subject_button_1.text = subjectList[0].subjectName
        subject_button_2.text = subjectList[1].subjectName
        subject_button_3.text = subjectList[2].subjectName
        subject_button_4.text = subjectList[3].subjectName
    }

    /**
     *  to populate the lessons recyclerView
     */
    private fun accessingRepository(courseId: Int,subjectId: Int){
        populateRecycler(courseId, subjectId)
    }

    private fun populateRecycler(courseId: Int, subjectId: Int){
        lessons_recycler_view.adapter = CourseAdapter(courseId, subjectId)
    }

    override fun onClick(v: View?) {
        when (v) {
            icon_1, subject_button_1 -> {
                accessingRepository(courseObject.courseId,courseObject.Subjects[0].subjectId)
            }
            icon_2, subject_button_2 -> {
                accessingRepository(courseObject.courseId,courseObject.Subjects[1].subjectId)
            }
            icon_3, subject_button_3 -> {
                accessingRepository(courseObject.courseId,courseObject.Subjects[2].subjectId)
            }
            icon_4, subject_button_4 -> {
                accessingRepository(courseObject.courseId,courseObject.Subjects[3].subjectId)
            }
        }
    }
}
