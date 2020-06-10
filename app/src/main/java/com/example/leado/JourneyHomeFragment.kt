package com.example.leado

import android.opengl.Visibility
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.leado.models.Subject
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_journey_home.*

/**
 * A simple [Fragment] subclass.
 */
class JourneyHomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_journey_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        lessons_recycler_view.layoutManager = LinearLayoutManager(this.context,LinearLayoutManager.HORIZONTAL,false)
        lessons_recycler_view.adapter = CourseAdapter(getCourseList())
    }
    private fun getCourseList(): List<Subject>{

        val subjectList: MutableList<Subject> = mutableListOf()
        subjectList.add(Subject("subject\nName",1,"lesson description1"))
        subjectList.add(Subject("subject\nName",2,"lesson description2"))
        subjectList.add(Subject("subject\nName",3,"lesson description3"))
        return subjectList
    }

}
