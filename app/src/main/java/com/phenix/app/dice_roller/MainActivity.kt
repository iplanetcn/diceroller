package com.phenix.app.dice_roller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var mBtnRoll: Button
    private lateinit var mIvDiceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBtnRoll = findViewById(R.id.btn_roll)
        mIvDiceImage = findViewById(R.id.iv_dice_image)
        mBtnRoll.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val drawableRes = when (Random.nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        mIvDiceImage.setImageResource(drawableRes)
    }
}