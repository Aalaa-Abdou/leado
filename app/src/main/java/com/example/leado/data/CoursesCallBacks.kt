package com.example.leado.data

import com.example.leado.data.models.Course

interface CoursesCallBacks {

    fun onCoursesLoaded(characters: List<Course>)

    fun onError()
}