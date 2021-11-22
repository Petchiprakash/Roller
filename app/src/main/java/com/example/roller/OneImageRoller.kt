package com.example.roller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.roller.databinding.ActivityOneImageRollerBinding

class OneImageRoller : AppCompatActivity() {
    private lateinit var binding: ActivityOneImageRollerBinding
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
        binding = ActivityOneImageRollerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnRollOneImg1.setOnClickListener {
            val roll = characters.shuffled().first()
            binding.imgOneRoll.setImageResource(roll)
        }
    }
}