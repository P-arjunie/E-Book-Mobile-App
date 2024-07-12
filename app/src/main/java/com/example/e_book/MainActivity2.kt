package com.example.e_book

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.e_book.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)



        binding.bottomNavigation.setOnItemSelectedListener {
        when (it.itemId){
            R.id.bottom_home ->{
                replaceFragment(homeFragment())
                true
            }
            R.id.bottom_category ->{
                replaceFragment(categoryFragment())
                true
            }
            R.id.bottom_library ->{
                replaceFragment(libraryFragment())
                true
            }
            R.id.bottom_profile ->{
                replaceFragment(profileFragment())
                true
            }
            else -> false
            }
        }
         replaceFragment(homeFragment())


    }
    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }
}