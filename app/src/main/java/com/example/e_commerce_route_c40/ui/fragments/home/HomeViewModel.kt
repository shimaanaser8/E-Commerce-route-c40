package com.example.e_commerce_route_c40.ui.fragments.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    private val _home = MutableLiveData<String>()
    val home get() = _home


    fun getCategoryList() {
        viewModelScope.launch (Dispatchers.IO){
            try {

            } catch (e: Exception) {

            }
        }
    }

}