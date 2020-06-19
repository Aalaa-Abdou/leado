package com.example.leado

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.leado.data.models.Subject
import kotlinx.android.synthetic.main.lesson_item.view.*

class CourseAdapter(private val subjectList: List<Subject>, private val subjectId: Int):
    RecyclerView.Adapter<CourseAdapter.CourseViewHolder>() {

    class CourseViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val subjectTitle: TextView = itemView.subject_name_TV
        val lessonNumber: TextView = itemView.lesson_number_TV
        val lessonDescription: TextView = itemView.lesson_description_TV
        val startButton: Button = itemView.start_button
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        return CourseViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.lesson_item, parent,false))
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        holder.subjectTitle.text = subjectList[subjectId].lessons[position].lessonName
        holder.lessonNumber.text = "Lesson ${subjectList[subjectId].lessons[position].index}"
        holder.lessonDescription.text = subjectList[subjectId].lessons[position].lessonDescription
        holder.startButton.setOnClickListener {
            val action = JourneyHomeFragmentDirections.actionJourneyHomeFragmentToVideoActivity(subjectList[subjectId].lessons[position].lessonVideoID,subjectList[subjectId].lessons[position].lessonDescription)
            Navigation.findNavController(it).navigate(action)
            SharedViewModel().sendingValue(subjectList[subjectId])
            SharedViewModel().sendLesson(subjectList[subjectId].lessons[position])
        }
    }

    override fun getItemCount(): Int {
        return subjectList[subjectId].lessons.size
    }
}