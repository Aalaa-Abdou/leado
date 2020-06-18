package com.example.leado.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.leado.data.models.Course
import com.example.leado.data.repositories.CourseRepository

class CourseViewModel : ViewModel() {

    fun getCourses() : List<Course> {
        return CourseRepository.getCourse()
    }


}