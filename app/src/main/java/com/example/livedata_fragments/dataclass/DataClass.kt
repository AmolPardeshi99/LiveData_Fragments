package com.example.livedata_fragments.dataclass

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData

class DataClass {

    var fragmentA_Version =0
    var fragmentB_Version =0

    private val fragmentAMutableLiveData = MutableLiveData<String>()
    private val fragmentBMutableLiveData = MutableLiveData<String>()

    private val mediaterLiveData = MediatorLiveData<String>()

    fun getMediaterLiveData() : LiveData<String>{

        mediaterLiveData.addSource(fragmentAMutableLiveData,{
            mediaterLiveData.value = it
        })

        mediaterLiveData.addSource(fragmentBMutableLiveData,{
            mediaterLiveData.value = it
        })

        return mediaterLiveData
    }

    fun getFragment_AnewData(){
        fragmentA_Version++
        fragmentAMutableLiveData.value = "Fragment A Data $fragmentA_Version"
    }

    fun getFragment_BnewData(){
        fragmentB_Version++
        fragmentBMutableLiveData.value = "Fragment B Data $fragmentB_Version"
    }
}