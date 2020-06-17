package com.example.leado

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.leado.data.models.Subject

class SharedViewModel: ViewModel() {

    private var mutableLiveData: MutableLiveData<Subject> = MutableLiveData()
     public fun sendingValue(subjectObj: Subject){
         mutableLiveData.postValue(subjectObj)
     }
    public fun receivingValue(): LiveData<Subject>{
        return mutableLiveData
    }
}