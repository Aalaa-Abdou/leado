package com.example.leado.data.models

data class Courses(val course: List<Course>)
data class Course(val courseName: String, val Subjects: List<Subject>, val numberOfSubjects: Int, val courseId: Int)
data class Subject(val subjectName: String, val subjectIcon: List<Icons>, val lessons: List<Lesson>, val subjectId: Int)
data class Lesson(val index: Int, val lessonDescription: String, val lessonVideoID: String, val lessonName: String)
data class Icons(val Icon: Int)