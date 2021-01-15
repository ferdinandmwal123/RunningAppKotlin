package com.mwalagho.ferdinand.runningapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.mwalagho.ferdinand.runningapp.repositories.MainRepository

class MainViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
) : ViewModel() {
}