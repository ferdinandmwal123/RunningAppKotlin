package com.mwalagho.ferdinand.runningapp.ui.fragments

import android.content.SharedPreferences
import androidx.fragment.app.Fragment
import com.mwalagho.ferdinand.runningapp.R
import com.mwalagho.ferdinand.runningapp.other.Constants.KEY_NAME
import com.mwalagho.ferdinand.runningapp.other.Constants.KEY_WEIGHT
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_settings.*
import javax.inject.Inject

@AndroidEntryPoint
class SettingsFragment: Fragment(R.layout.fragment_settings) {

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    private fun loadFieldsFromSharedPref(){
        val name = sharedPreferences.getString(KEY_NAME,"")
        val weight = sharedPreferences.getFloat(KEY_WEIGHT,80f)
    }
    private fun applyChangesToSharedPref(): Boolean{
        val nameText = etName.text.toString()
        val weightText  = etWeight.text.toString()
        if(nameText.isEmpty() || weightText.isEmpty()){
            return false
        }
        sharedPreferences.edit()
            .putString(KEY_NAME, nameText)
            .putFloat(KEY_WEIGHT, weightText.toFloat())
            .apply()
        val toolbarText = "Let's go $nameText"
        requireActivity().tvToolbarTitle.setText(toolbarText)
        return true
    }

}