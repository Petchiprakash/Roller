package com.example.roller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.roller.databinding.ActivityTwoImageRollerBinding

class TwoImageRoller : AppCompatActivity() {
    private lateinit var binding: ActivityTwoImageRollerBinding
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
        binding = ActivityTwoImageRollerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnRollTwoImg2.setOnClickListener{
            val roll1 = characters.shuffled().first()
            val roll2 = characters.shuffled().last()
            binding.imgTwoRoll1.setImageResource(roll1)
            binding.imgTwoRoll2.setImageResource(roll2)
        }
    }
}