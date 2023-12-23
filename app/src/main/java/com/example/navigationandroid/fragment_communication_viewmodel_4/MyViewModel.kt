package com.example.navigationandroid.fragment_communication_viewmodel_4

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    private val mutableSelectedItem = MutableLiveData<Int>()
    val selectedItem: LiveData<Int>
        get() = mutableSelectedItem

    fun generateRandomInt(item: Int) {
        mutableSelectedItem.value = item
    }
}
