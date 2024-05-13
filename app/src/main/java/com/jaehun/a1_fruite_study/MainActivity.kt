package com.jaehun.a1_fruite_study

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //사진을 클릭했을 때 메시지 띄우기 toast
        val image1 = findViewById<ImageView>(R.id.fruit_image_1)
        image1.setOnClickListener {
            Toast.makeText(this, "1번 사진 클릭", Toast.LENGTH_LONG).show()

            // 이미지 클릭하면 다음 화면으로 넘어가는거
            // 구글링 : 안드로이드 스튜디오 화면전환 kotlin   검색
            var intent = Intent(this, Fruit1Activity::class.java)
            startActivity(intent)
        }
    }
}