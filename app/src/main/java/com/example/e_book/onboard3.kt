package com.example.e_book

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class onboard3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var btn3signup = findViewById<Button>(R.id.btn3signup)
        btn3signup.setOnClickListener {
            var intent = Intent(this,Sign_Up::class.java)
            startActivity(intent)
        }
        var btn3signin = findViewById<Button>(R.id.btn3signin)
        btn3signin.setOnClickListener {
            var intent = Intent(this,sign_in::class.java)
            startActivity(intent)
        }
    }
}