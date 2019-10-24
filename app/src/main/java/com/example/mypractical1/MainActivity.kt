package com.example.mypractical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }
        private fun rollDice() {
            Toast.makeText(this, "button clicked",
                Toast.LENGTH_SHORT).show()

            diceImage = findViewById(R.id.dice_image1)
            diceImage.setImageResource(getDrawableResource())
            diceImage = findViewById(R.id.dice_image2)
            diceImage.setImageResource(getDrawableResource())
            diceImage = findViewById(R.id.dice_image3)
            diceImage.setImageResource(getDrawableResource())
        }
        private fun getDrawableResource():Int{

            val randomInt = Random().nextInt(6) + 1
            val drawableResource = when (randomInt) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            return drawableResource
        }
    }

