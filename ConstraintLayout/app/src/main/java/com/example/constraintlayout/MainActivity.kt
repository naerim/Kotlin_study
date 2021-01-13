package com.example.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
//    lateinit : 나중에 초기화할 것이라는 것을 알려준다
    lateinit var textView : TextView
    lateinit var clickButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        clickButton = findViewById(R.id.clickButton)

//        클릭 이벤트
        clickButton.setOnClickListener {
            textView.text = "버튼을 눌려주세요"
        }
    }
}