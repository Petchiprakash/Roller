package com.example.roller

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.roller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnRoll1.setOnClickListener{
            Intent(this,OneImageRoller::class.java).also {
                startActivity(it)
            }
        }
        binding.btnRoll2.setOnClickListener{
            Intent(this,TwoImageRoller::class.java).also {
                startActivity(it)
            }
        }
    }
}