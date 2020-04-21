package com.example.ludo_dice

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.btnID)
        var img = findViewById<ImageView>(R.id.imageID)

        button.setOnClickListener {
            var random = Random().nextInt(6) + 1
           var result = when(random){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6

                else -> "Something else"
            }

            img.setImageResource(result as Int)

        }
    }
}
