package com.xeo.gits

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ReverseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reverse)
        val btnReverse: Button = findViewById(R.id.btnResultReverse)
        val etReverse: EditText = findViewById(R.id.etTextReverse)
        btnReverse.setOnClickListener {
            val text = etReverse.text.toString()
            val reversed = text.reversed()
            Toast.makeText(this, reversed, Toast.LENGTH_SHORT).show()
        }
    }
}