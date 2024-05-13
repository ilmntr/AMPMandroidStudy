package com.jaehun.a1_fruite_study

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_image_inside)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var getdata = intent.getStringExtra("data")
        var fruitImage = findViewById<ImageView>(R.id.memberImageArea)

        if (getdata == "1"){
            fruitImage.setImageResource(R.drawable.img_1_apple)
        }
        if (getdata == "2"){
            fruitImage.setImageResource(R.drawable.img_2_banana)
        }
        if (getdata == "3"){
            fruitImage.setImageResource(R.drawable.img_3_carrot)
        }
        if (getdata == "4"){
            fruitImage.setImageResource(R.drawable.img_4_potato)
        }
        if (getdata == "5"){
            fruitImage.setImageResource(R.drawable.img_5_watermelon)
        }
        if (getdata == "6"){
            fruitImage.setImageResource(R.drawable.img_6_strawberry)
        }
        if (getdata == "7"){
            fruitImage.setImageResource(R.drawable.img_7_peach)
        }
//        Toast.makeText(this, getdata, Toast.LENGTH_LONG).show()

    }

}