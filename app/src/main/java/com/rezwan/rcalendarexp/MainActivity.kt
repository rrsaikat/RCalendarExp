package com.rezwan.rcalendarexp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rezwan.rcalenderlib.callbacks.YearRangeListener
import com.rezwan.rcalenderlib.ext.error
import com.rezwan.rcalenderlib.models.RCalendar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), YearRangeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        yearRangeCalendarView.setYearRangeListener(this)
    }

    override fun OnDateClicked(rCalendar: RCalendar, position: Int) {
        error("OnDateClicked", "$rCalendar.date")
    }

    override fun OnSelectedDateFound(
        rCalendar: RCalendar,
        firstDayOfWeek: String,
        lastDayOfWeek: String,
        dayPosition: Int,
        currentPageNum: Int
    ) {
        error("OnSelectedDateFound","$rCalendar.date")
    }
}
