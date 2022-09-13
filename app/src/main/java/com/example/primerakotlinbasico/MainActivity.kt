package com.example.primerakotlinbasico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button);
        rollButton.setOnClickListener{rollDice()}
        val restablecerButton: Button = findViewById(R.id.button3)
        restablecerButton.setOnClickListener { restablecer() }
    }
    private fun rollDice() {
        val randomInt = (1..6).random()
        val randomInt2 = (1..6).random()
        diceImage = findViewById(R.id.ivDado)
        diceImage2 = findViewById(R.id.ivDado2)
        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource2 = when (randomInt2){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        diceImage2.setImageResource(drawableResource2)
    }
    private fun restablecer(){
        val dadoReset: ImageView = findViewById(R.id.ivDado)
        val drawableResource = R.drawable.empty_dice
        dadoReset.setImageResource(drawableResource)
        val dadoReset2: ImageView = findViewById(R.id.ivDado2)
        val drawableResource2 = R.drawable.empty_dice
        dadoReset2.setImageResource(drawableResource2)
    }

}