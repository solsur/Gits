package com.xeo.gits

import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class EmailFormatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_format)
        val btnEmail: Button = findViewById(R.id.btnResultEmail)
        val etEmail: EditText = findViewById(R.id.etTextEmail)

        btnEmail.setOnClickListener {
            val email= etEmail.text.toString()

            if (email.isEmpty()){
                etEmail.error = "Email harus diisi!"
                etEmail.requestFocus()
                return@setOnClickListener
            }

            if (email.length >= 20){
                etEmail.error = "Panjang email maksimal 20 Karakter!"
                etEmail.requestFocus()
                return@setOnClickListener
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                etEmail.error = "Email tidak valid!"
                etEmail.requestFocus()
                return@setOnClickListener
            }
        }
    }
}