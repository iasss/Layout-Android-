package com.example.layoutbest.ui.anak

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AnakViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Fragment Activity lain"
    }
    val text: LiveData<String> = _text
}
