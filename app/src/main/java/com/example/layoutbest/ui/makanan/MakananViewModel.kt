package com.example.layoutbest.ui.makanan

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MakananViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Fragment Activity lain"
    }
    val text: LiveData<String> = _text
}