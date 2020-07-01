package com.example.leado.data.repositories

import com.example.leado.R
import com.example.leado.data.models.Course
import com.example.leado.data.models.Icons
import com.example.leado.data.models.Lesson
import com.example.leado.data.models.Subject

object CourseRepository {
    private fun getLesson(subjectId: Int): List<Lesson> {
        val lesson: MutableList<Lesson> = mutableListOf()
        when (subjectId) {
            1 -> {
                lesson.add(Lesson(0, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(1, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
                return lesson
            }
            2 -> {
                lesson.add(Lesson(0, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(1, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
                return lesson
            }
            3 -> {
                lesson.add(Lesson(0, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(1, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
                return lesson
            }
            4 -> {
                lesson.add(Lesson(0, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(1, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
                return lesson
            }
            5 -> {
                lesson.add(Lesson(0, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(1, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
                return lesson
            }
            6 -> {
                lesson.add(Lesson(0, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(1, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
                return lesson
            }
            7 -> {
            lesson.add(Lesson(0, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
            lesson.add(Lesson(1, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
            lesson.add(Lesson(2, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
            lesson.add(Lesson(3, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
            lesson.add(Lesson(4, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
            return lesson
        }
            8 -> {
            lesson.add(Lesson(0, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
            lesson.add(Lesson(1, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
            lesson.add(Lesson(2, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
            lesson.add(Lesson(3, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
            lesson.add(Lesson(4, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
            return lesson
        }
            9 -> {
                lesson.add(Lesson(0, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(1, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
                return lesson
            }
            10 -> {
                lesson.add(Lesson(0, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(1, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
                return lesson
            }
            11 -> {
                lesson.add(Lesson(0, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(1, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
                return lesson
            }
            12 -> {
                lesson.add(Lesson(0, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(1, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
                return lesson
            }
            else -> return emptyList()
        }
    }

    private fun getSubject(courseId: Int): List<Subject>{
        val subject: MutableList<Subject> = mutableListOf()
        when(courseId){
            1 ->{
                subject.apply {
                add(Subject(getLesson(1), getIcon(), 1,"pranding1"))
                add(Subject(getLesson(2), getIcon(), 2,"pranding2"))
                add(Subject(getLesson(3), getIcon(), 3,"oranding3"))
                add(Subject(getLesson(4), getIcon(), 4,"pranding4"))
        }
        }
            2 ->{
                subject.apply {
                    add(Subject(getLesson(5), getIcon(), 5,"support system"))
                    add(Subject(getLesson(6), getIcon(), 6,"core values"))
                    add(Subject(getLesson(7), getIcon(), 7,"strength weakness"))
                    add(Subject(getLesson(8), getIcon(), 8,"Goals & inspiration"))
                }
            }
            3 ->{
                subject.apply {
                    add(Subject(getLesson(9), getIcon(), 9,"support system"))
                    add(Subject(getLesson(10), getIcon(), 10,"core values"))
                    add(Subject(getLesson(11), getIcon(), 11,"strength weakness"))
                    add(Subject(getLesson(12), getIcon(), 12,"Goals & inspiration"))
                }
            }
        }
        return subject
    }

    private fun getIcon(): List<Icons> {
        val icon: MutableList<Icons> = mutableListOf()
        icon.apply {
            add(Icons(R.drawable.book_shelf_one))
            add(Icons(R.drawable.book_shelf_two))
            add(Icons(R.drawable.book_shelf_three))
            add(Icons(R.drawable.book_shelf_four))
            add(Icons(R.drawable.book_shelf_five))
        }
        return icon
    }

    fun getCourse(): List<Course>{
        val course: MutableList<Course> = mutableListOf()
        course.apply {
            add(Course(getSubject(1), 1,"Personal-Branding",4))
            add(Course(getSubject(2), 2,"Mind-Mapping",4))
            add(Course(getSubject(3),3 ,"Self-Awareness",4))
        }
        return course
    }
}