package com.example.leado

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.leado.data.models.Course
import com.example.leado.data.models.Lesson
import com.example.leado.data.models.Subject

class SharedViewModel: ViewModel() {

    private var mutableLiveData: MutableLiveData<Subject> = MutableLiveData()
    private var courseLiveData: MutableLiveData<Course> = MutableLiveData()
    private var lessonLiveData: MutableLiveData<Lesson> = MutableLiveData()

    public fun sendingValue(subjectObj: Subject){
        mutableLiveData.postValue(subjectObj)
    }
    public fun receivingValue(): LiveData<Subject>{
        return mutableLiveData
    }

    public fun sendCourse(courseObject: Course){
        courseLiveData.postValue(courseObject)
    }
    public fun getCourse(): LiveData<Course>{
        return courseLiveData
    }

    public fun sendLesson(lessonObject: Lesson){
        lessonLiveData.postValue(lessonObject)
    }
    public fun getLesson(): LiveData<Lesson>{
        return lessonLiveData
    }
}