package com.gurus.multiplecustomcalendar

import android.os.Bundle
import android.util.Log
import android.widget.CalendarView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var calendar: Calendar
    lateinit var calendarView: CalendarView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calendarView = findViewById(R.id.firstCalendar)
        calendar = Calendar.getInstance()
       /* calendar[Calendar.MONTH] = Calendar.NOVEMBER
        calendar[Calendar.DAY_OF_MONTH] = 9
        calendar[Calendar.YEAR] = 2012


        calendar.add(Calendar.DAY_OF_MONTH, 1)
        calendar.add(Calendar.YEAR, 1)*/
        calendarView.setOnDateChangeListener(object : CalendarView.OnDateChangeListener {
            override fun onSelectedDayChange(
                view: CalendarView,
                year: Int,
                month: Int,
                dayOfMonth: Int
            ) {
                val msg =
                    "Selected date Day: " + dayOfMonth + " Month : " + (month + 1) + " Year " + year
                Log.e("response", msg)
                Toast.makeText(this@MainActivity, "Date Selected", Toast.LENGTH_SHORT).show()
            }
        })


    }
}