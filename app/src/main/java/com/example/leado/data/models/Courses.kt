package com.example.leado.data.models

data class Courses(val course: List<Course>)
data class Course(val Subjects: List<Subject>,val courseId: Int,  val courseName: String, val numberOfSubjects: Int )
data class Subject(val lessons: List<Lesson>, val subjectIcon: List<Icons>, val subjectId: Int, val subjectName: String)
data class Lesson(val index: Int, val lessonDescription: String, val lessonVideoID: String, val lessonName: String)
data class Icons(val Icon: Int)