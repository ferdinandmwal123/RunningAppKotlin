package com.mwalagho.ferdinand.runningapp.ui.fragments

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.mwalagho.ferdinand.runningapp.R

class CancelTrackingDialog : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return MaterialAlertDialogBuilder(
            requireContext(),
            R.style.ThemeOverlay_AppCompat_Dialog_Alert
        )
            .setTitle("Cancel the run?")
            .setMessage("Are you sure?")
            .setIcon(R.drawable.ic_delete)
            .setPositiveButton("Yes") { _, _ ->
                stopRun()
            }
            .setNegativeButton("No") { dialog, _ ->
                dialog.cancel()

            }
            .create()
    }
}