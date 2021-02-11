package com.mwalagho.ferdinand.runningapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mwalagho.ferdinand.runningapp.db.Run
import com.mwalagho.ferdinand.runningapp.repositories.MainRepository
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
) : ViewModel() {

    val runsSortedByDate = mainRepository.getAllRunsSortedByDate()
    val runsSortedByDistance = mainRepository.getAllRunsSortedByDistance()
    val runsSortedByCaloriesBurned = mainRepository.getAllRunsSortedByCaloriesBurned()
    val runsSortedByTimeInMillis = mainRepository.getAllRunsSortedByTimeInMillis()
    val runsSortedByAvgSpeed= mainRepository.getAllRunsSortedByAvgSpeed()

    fun insertRun(run: Run) = viewModelScope.launch {
        mainRepository.insertRun(run)
    }
}