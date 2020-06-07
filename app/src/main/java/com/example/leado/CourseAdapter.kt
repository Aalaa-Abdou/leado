package com.example.leado

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.leado.models.Course
import com.example.leado.models.Subject
import kotlinx.android.synthetic.main.fragment_journey_home.view.*
import kotlinx.android.synthetic.main.lesson_item.view.*

class CourseAdapter(private val courseList: List<Subject>):
    RecyclerView.Adapter<CourseAdapter.CourseViewHolder>() {

    class CourseViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val subjectTitle: TextView = itemView.subject_name_TV
        val lessonNumber: TextView = itemView.lesson_number_TV
        val lessonDescription: TextView = itemView.lesson_description_TV
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        return CourseViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.lesson_item, parent,false))
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        holder.subjectTitle.text = courseList[position].subjectName
        holder.lessonNumber.text = courseList[position].lesson[position].lessonNumber.toString()
        holder.lessonDescription.text = courseList[position].lesson[position].lessonDescription
    }

    override fun getItemCount(): Int {
        return courseList.size
    }
}