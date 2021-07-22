package com.xeo.gits

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class TimeConversionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_conversion)
        val btnTime: Button = findViewById(R.id.btnResultDate)
        val etTime: EditText = findViewById(R.id.etTextDate)

    }
}