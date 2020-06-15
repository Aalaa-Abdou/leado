package com.example.leado

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.leado.activity.VideoActivity
import com.example.leado.models.Snippets
import com.example.leado.models.Videos
import kotlinx.android.synthetic.main.lesson_item.view.*

class CourseAdapter(private val videoList: List<Videos>):
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

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        holder.subjectTitle.text = videoList[position].snippet.title
        holder.lessonNumber.text = "Lesson ${holder.adapterPosition + 1}"
        holder.lessonDescription.text = videoList[position].snippet.description
        holder.startButton.setOnClickListener {
            val action = JourneyHomeFragmentDirections.actionJourneyHomeFragmentToVideoActivity(videoList[position].snippet.resourceId.videoId,videoList[position].snippet.description)
            Navigation.findNavController(it).navigate(action)
        }
//        holder.startButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_journeyHomeFragment_to_searchFragment2))
    }

    override fun getItemCount(): Int {
        return videoList.size
    }
}