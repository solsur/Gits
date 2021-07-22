package com.xeo.gits

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PalindromeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_palindrome)
        val btnPalindrome: Button = findViewById(R.id.btnResultPalindrome)
        val etPalndrome: EditText = findViewById(R.id.etTextPalindrome)
        btnPalindrome.setOnClickListener {
            val text = etPalndrome.text.toString()
            if (ispalindrome(text)) {
                Toast.makeText(this, "Palindrome", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Bukan Palindrome", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun ispalindrome(text: String): Boolean {
        val reverseString = text.reversed()
        return text.equals(reverseString, ignoreCase = true)
    }
}