package com.example.roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_one_image_roller.*

class OneImageRoller : AppCompatActivity() {
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
        setContentView(R.layout.activity_one_image_roller)
        btnRollOneImg1.setOnClickListener {
            val roll = characters.shuffled().first()
            imgOneRoll.setImageResource(roll)
        }
    }
}