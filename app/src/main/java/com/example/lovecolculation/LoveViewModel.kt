package com.example.lovecolculation

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.lovecolculation.remote.LoveModel

class LoveViewModel : ViewModel() {
    val repository = Repository()
    fun liveLove(firstName: String, secondName: String): LiveData<LoveModel> {
        return repository.getLove(firstName, secondName)
    }
}