package com.example.shopease.ui.activities

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class ParentViewModel<N>: ViewModel() {
    val toastLiveData = MutableLiveData<String>()
    val navigator: N? = null
}