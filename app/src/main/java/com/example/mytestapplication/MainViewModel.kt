package com.example.mytestapplication

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData

class MainViewModel(val intialValue: Int) : ViewModel() {

    val TAG = "MainViewModel"

    private val _count = mutableStateOf(intialValue)
    val count: State<Int> get() = _count

    fun increment() {
        _count.value += 1
    }

}