package com.mwalagho.ferdinand.runningapp.other

import android.content.Context
import com.github.mikephil.charting.components.MarkerView
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.highlight.Highlight
import com.mwalagho.ferdinand.runningapp.db.Run
import kotlinx.android.synthetic.main.item_run.view.tvAvgSpeed
import kotlinx.android.synthetic.main.item_run.view.tvDate
import kotlinx.android.synthetic.main.item_run.view.tvDistance
import kotlinx.android.synthetic.main.marker_view.view.*
import java.text.SimpleDateFormat
import java.util.*

class CustomMarkerView(
    val runs: List<Run>,
    c: Context,
    layoutId: Int
) : MarkerView(c, layoutId) {


    override fun refreshContent(e: Entry?, highlight: Highlight?) {
        super.refreshContent(e, highlight)

        if (e == null) {
            return
        }
        val currentRunId = e.x.toInt()
        val run = runs[currentRunId]

        val calendar = Calendar.getInstance().apply {
            timeInMillis = run.timestamp
        }
        val dateFormat = SimpleDateFormat("dd.MM.yy", Locale.getDefault())
        tvDate.text = dateFormat.format(calendar.time)

        val avgSpeed = "${run.avgSpeedInKMH}km/h"
        tvAvgSpeed.text = avgSpeed

        val distanceInKm = "${run.distanceInMeters / 1000f}km"
        tvDistance.text = distanceInKm

        tvDuration.text = TrackingUtility.getFormattedStopwatchTime(run.timeInMillis)

        val caloriesBurned = "${run.caloriesBurned}kcal"
        tvCaloriesBurned.text = caloriesBurned
    }
    }
}