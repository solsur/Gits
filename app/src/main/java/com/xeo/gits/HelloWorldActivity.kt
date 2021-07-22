package com.xeo.gits

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HelloWorldActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world)
        val btnHello: Button = findViewById(R.id.btnResult)
        val etHello: EditText = findViewById(R.id.etText)

        btnHello.setOnClickListener {
            val text = etHello.text.toString()
            val number = text.toInt()
            if (number%3 == 0) {
                Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()
            }
            else if(number%5 == 0){
                Toast.makeText(this, "World", Toast.LENGTH_SHORT).show()
            }
            else if(number%3 == 0 || number%5 == 0){
                Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Bukan bilangan yang habis dibagi 3 dan 5", Toast.LENGTH_SHORT).show()
            }
        }
    }
}