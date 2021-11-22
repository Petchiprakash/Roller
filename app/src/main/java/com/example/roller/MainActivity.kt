package com.example.roller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnRoll1.setOnClickListener{
            Intent(this,OneImageRoller::class.java).also {
                startActivity(it)
            }
        }
        btnRoll2.setOnClickListener{
            Intent(this,TwoImageRoller::class.java).also {
                startActivity(it)
            }
        }
    }
}