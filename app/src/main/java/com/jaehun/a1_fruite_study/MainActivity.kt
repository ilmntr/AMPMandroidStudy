package com.jaehun.a1_fruite_study

import android.content.Intent
import android.os.Bundle
import android.util.Log
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

//        //사진을 클릭했을 때 메시지 띄우기 toast
//        val image1 = findViewById<ImageView>(R.id.fruit_image_1)
//        image1.setOnClickListener {
//            Toast.makeText(this, "1번 사진 클릭", Toast.LENGTH_LONG).show()
//
//            // 이미지 클릭하면 다음 화면으로 넘어가는거
//            // 구글링 : 안드로이드 스튜디오 화면전환 kotlin   검색
//            var intent = Intent(this, Fruit1Activity::class.java)
//            startActivity(intent)
//       }

        val btn1 = findViewById<ImageView>(R.id.fruit_image_1)
        val btn2 = findViewById<ImageView>(R.id.fruit_image_2)
        val btn3 = findViewById<ImageView>(R.id.fruit_image_3)
        val btn4 = findViewById<ImageView>(R.id.fruit_image_4)
        val btn5 = findViewById<ImageView>(R.id.fruit_image_5)
        val btn6 = findViewById<ImageView>(R.id.fruit_image_6)
        val btn7 = findViewById<ImageView>(R.id.fruit_image_7)

        btn1.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","1")
            startActivity(intent)
        }
        btn2.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","2")
            startActivity(intent)
        }
        btn3.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","3")
            startActivity(intent)
        }
        btn4.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","4")
            startActivity(intent)
        }
        btn5.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","5")
            startActivity(intent)
        }
        btn6.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","6")
            startActivity(intent)
        }
        btn7.setOnClickListener{
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","7")
            startActivity(intent)
        }
//        Log.d("MainActivity","testlog")//디버그
//        Log.e("MainActivity","testlog")//오류
//        Log.w("MainActivity","testlog")//경고
//        Log.i("MainActivity","testlog")//정보
//        Log.v("MainActivity","testlog")//상세


    }
}