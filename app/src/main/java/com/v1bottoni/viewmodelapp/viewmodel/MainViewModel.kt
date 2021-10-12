package com.v1bottoni.viewmodelapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var score = MutableLiveData<Int>()

    init {
        score.postValue(0)
    }

    fun addScore() = score.postValue(score.value?.plus(1))
    fun removeScore() = score.postValue(score.value?.minus(1))
}