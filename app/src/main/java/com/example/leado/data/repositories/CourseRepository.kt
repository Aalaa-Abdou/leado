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
                lesson.add(Lesson(1, "", "OktnzZkmpB0","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(5, "", "","pranding_fifth lesson,S${subjectId}"))
                return lesson
            }
            2 -> {
                lesson.add(Lesson(1, "", "","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(5, "", "","pranding_fifth lesson,S${subjectId}"))
                return lesson
            }
            3 -> {
                lesson.add(Lesson(1, "", "","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(5, "", "","pranding_fifth lesson,S${subjectId}"))
                return lesson
            }
            4 -> {
                lesson.add(Lesson(1, "", "","pranding_first lesson,S${subjectId}"))
                lesson.add(Lesson(2, "", "","pranding_second lesson,S${subjectId}"))
                lesson.add(Lesson(3, "", "","pranding_third lesson,S${subjectId}"))
                lesson.add(Lesson(4, "", "","pranding_fourth lesson,S${subjectId}"))
                lesson.add(Lesson(5, "", "","pranding_fifth lesson,S${subjectId}"))
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
                    add(Subject("support system", getIcon(), getLesson(2),5))
                    add(Subject("core values", getIcon(), getLesson(2),6))
                    add(Subject("strength weakness", getIcon(), getLesson(2),7))
                    add(Subject("Goals & inspiration", getIcon(), getLesson(2),8))
                }
            }
            3 ->{
                subject.apply {
                    add(Subject("support system", getIcon(), getLesson(3),3))
                    add(Subject("core values", getIcon(), getLesson(3),3))
                    add(Subject("strength weakness", getIcon(), getLesson(3),3))
                    add(Subject("Goals & inspiration", getIcon(), getLesson(3),3))
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