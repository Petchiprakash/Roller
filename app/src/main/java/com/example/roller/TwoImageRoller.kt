package com.example.roller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_two_image_roller.*

class TwoImageRoller : AppCompatActivity() {
    private var characters = mutableListOf(
        R.drawable.naruto,
        R.drawable.kaguya,
        R.drawable.sasuke,
        R.drawable.hagaromo,
        R.drawable.hashirama,
        R.drawable.lady,
        R.drawable.madara,
        R.drawable.obito,
        R.drawable.sakura
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_image_roller)
        btnRollTwoImg2.setOnClickListener{
            val roll1 = characters.shuffled().first()
            val roll2 = characters.shuffled().last()
            imgTwoRoll1.setImageResource(roll1)
            imgTwoRoll2.setImageResource(roll2)
        }
    }
}