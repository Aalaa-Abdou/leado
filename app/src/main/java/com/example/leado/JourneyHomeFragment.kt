package com.example.leado

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.leado.models.Course
import com.example.leado.models.Lesson
import com.example.leado.models.Subject
import kotlinx.android.synthetic.main.fragment_journey_home.*

/**
 * A simple [Fragment] subclass.
 */
class JourneyHomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val fragmentJourneyHome = inflater.inflate(R.layout.fragment_journey_home, container, false)
        lessons_recycler_view.layoutManager = LinearLayoutManager(fragmentJourneyHome.context,LinearLayoutManager.HORIZONTAL,false)
        lessons_recycler_view.adapter = CourseAdapter(getCourseList())
        return fragmentJourneyHome
    }
    private fun getCourseList(): List<Subject>{

        val subjectList: MutableList<Subject> = mutableListOf()
        val lessonList: MutableList<Lesson> = mutableListOf()
        subjectList.add(Subject("subject\nName",lessonList))
        subjectList.add(Subject("subject\nName",lessonList))
        subjectList.add(Subject("subject\nName",lessonList))
        return subjectList
    }

}
