package com.example.e_book

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var category_btn = findViewById<Button>(R.id.category)
        category_btn.setOnClickListener {
            var intent = Intent(this,categories::class.java)
            startActivity(intent)
        }

        var library_btn = findViewById<Button>(R.id.library)
        library_btn.setOnClickListener {
            var intent = Intent(this, library::class.java)
            startActivity(intent)
        }

        var profile_btn = findViewById<Button>(R.id.profile)
        profile_btn.setOnClickListener {
            var intent = Intent(this, profile::class.java)
            startActivity(intent)
        }
    }
}