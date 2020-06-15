package com.example.leado.models

data class Course(val courseName: String,val courseSubject:List<Subject>)
data class Subject(val subjectName: String, val lessonNumber: Int, val lessonDescription: String, val VideoID: String)
//data class Lesson()
