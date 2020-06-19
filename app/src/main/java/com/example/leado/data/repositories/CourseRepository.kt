package com.example.leado.data.repositories

import com.example.leado.R
import com.example.leado.data.models.Course
import com.example.leado.data.models.Icons
import com.example.leado.data.models.Lesson
import com.example.leado.data.models.Subject

object CourseRepository {
    fun getLesson(subjectId: Int): List<Lesson> {
        val lesson: MutableList<Lesson> = mutableListOf()
        when (subjectId) {
            1 -> {
                lesson.add(Lesson(1, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(5, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
                return lesson
            }
            2 -> {
                lesson.add(Lesson(1, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(5, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
                return lesson
            }
            3 -> {
                lesson.add(Lesson(1, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(5, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
                return lesson
            }
            4 -> {
                lesson.add(Lesson(1, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(5, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
                return lesson
            }
            5 -> {
                lesson.add(Lesson(1, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(5, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
                return lesson
            }
            6 -> {
                lesson.add(Lesson(1, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(5, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
                return lesson
            }
            7 -> {
            lesson.add(Lesson(1, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
            lesson.add(Lesson(2, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
            lesson.add(Lesson(3, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
            lesson.add(Lesson(4, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
            lesson.add(Lesson(5, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
            return lesson
        }
            8 -> {
            lesson.add(Lesson(1, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
            lesson.add(Lesson(2, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
            lesson.add(Lesson(3, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
            lesson.add(Lesson(4, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
            lesson.add(Lesson(5, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
            return lesson
        }
            9 -> {
                lesson.add(Lesson(1, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(5, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
                return lesson
            }
            10 -> {
                lesson.add(Lesson(1, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(5, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
                return lesson
            }
            11 -> {
                lesson.add(Lesson(1, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(5, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
                return lesson
            }
            12 -> {
                lesson.add(Lesson(1, "", "ijXjCtCXcN4","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "m9XhqkGFL5k","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "lcAtXpyn6DY","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "eRUd_ljNMRk","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(5, "", "Ex9IT1bq0PQ","pranding_fifth lesson,S${subjectId}"))
                return lesson
            }
            else -> return emptyList()
        }
    }

    fun getSubject(courseId: Int): List<Subject>{
        val subject: MutableList<Subject> = mutableListOf()
        when(courseId){
            1 ->{
                subject.apply {
                add(Subject("pranding1", getIcon(), getLesson(1),1))
                add(Subject("pranding2", getIcon(), getLesson(2),2))
                add(Subject("oranding3", getIcon(), getLesson(3),3))
                add(Subject("pranding4", getIcon(), getLesson(4),4))
        }
        }
            2 ->{
                subject.apply {
                    add(Subject("support system", getIcon(), getLesson(5),5))
                    add(Subject("core values", getIcon(), getLesson(6),6))
                    add(Subject("strength weakness", getIcon(), getLesson(7),7))
                    add(Subject("Goals & inspiration", getIcon(), getLesson(8),8))
                }
            }
            3 ->{
                subject.apply {
                    add(Subject("support system", getIcon(), getLesson(9),9))
                    add(Subject("core values", getIcon(), getLesson(10),10))
                    add(Subject("strength weakness", getIcon(), getLesson(11),11))
                    add(Subject("Goals & inspiration", getIcon(), getLesson(12),12))
                }
            }
        }
        return subject
    }

    fun getIcon(): List<Icons> {
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
            add(Course("Personal-Branding", getSubject(1),4,1))
            add(Course("Mind-Mapping", getSubject(2),4,2))
            add(Course("Self-Awareness", getSubject(3),4,3))
        }
        return course
    }
}