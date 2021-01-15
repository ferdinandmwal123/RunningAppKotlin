package com.mwalagho.ferdinand.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.mwalagho.ferdinand.runningapp.R
import com.mwalagho.ferdinand.runningapp.ui.viewmodels.MainViewModel
import com.mwalagho.ferdinand.runningapp.ui.viewmodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment:Fragment(R.layout.fragment_statistics) {

    private val viewModel: StatisticsViewModel by viewModels()

}