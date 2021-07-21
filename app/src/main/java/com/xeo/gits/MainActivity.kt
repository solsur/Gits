package com.xeo.gits

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Box1
        val box1:Button = findViewById(R.id.box1)
        val box4:Button = findViewById(R.id.box4)
        val box5:Button = findViewById(R.id.box5)

        box1.setOnClickListener {
            val intent = Intent(this,HelloWorldActivity::class.java)
            startActivity(intent)
        }

        box4.setOnClickListener {
            val intent = Intent(this,ReverseActivity::class.java)
            startActivity(intent)
        }

        box5.setOnClickListener {
            val intent = Intent(this,PalindromeActivity::class.java)
            startActivity(intent)
        }

    }
}