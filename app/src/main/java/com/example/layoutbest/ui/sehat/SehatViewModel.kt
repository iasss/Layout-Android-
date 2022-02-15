package com.example.layoutbest.ui.sehat

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SehatViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Fragment Activity lain"
    }
    val text: LiveData<String> = _text
}
