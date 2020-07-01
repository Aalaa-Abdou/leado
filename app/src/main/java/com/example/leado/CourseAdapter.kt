package com.example.leado

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.leado.data.models.Lesson
import com.example.leado.data.models.Subject
import com.google.gson.Gson
import kotlinx.android.synthetic.main.lesson_item.view.*

class CourseAdapter(private val SubjectObject: String):
    RecyclerView.Adapter<CourseAdapter.CourseViewHolder>() {
    private var gson = Gson()
    private val subjectObject = gson.fromJson(SubjectObject, Subject::class.java)
    private val lessonList: List<Lesson> = subjectObject.lessons
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
        holder.subjectTitle.text = lessonList[position].lessonName
        holder.lessonNumber.text = "Lesson ${lessonList[position].index + 1}"
        holder.lessonDescription.text = lessonList[position].lessonDescription
        holder.startButton.setOnClickListener {
            val action = JourneyHomeFragmentDirections.actionJourneyHomeFragmentToVideoActivity(SubjectObject,lessonList[position].index)
            Navigation.findNavController(it).navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return lessonList.size
    }
}