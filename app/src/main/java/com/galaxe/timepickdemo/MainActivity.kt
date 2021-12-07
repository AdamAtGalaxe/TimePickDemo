package com.galaxe.timepickdemo

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity(){
    lateinit var btn : Button
    lateinit var tv : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.pickBtn)
        tv = findViewById(R.id.tv)
        btn.setOnClickListener {

            var cal = Calendar.getInstance()

            var timeSetListener = TimePickerDialog.OnTimeSetListener { view, h, m ->
                cal.set(Calendar.HOUR_OF_DAY, h)
                cal.set(Calendar.MINUTE, m)
                tv.text = SimpleDateFormat("HH:mm").format(cal.time)
            }
            //TimePickerDialog(this, timeSetListener, cal.get)
            TimePickerDialog(this, timeSetListener, cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), true).show()
    }


    }
}