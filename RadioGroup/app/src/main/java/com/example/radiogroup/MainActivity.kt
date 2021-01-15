package com.example.radiogroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var radioGroup : RadioGroup
    lateinit var radioApple : RadioButton
    lateinit var radioOrange : RadioButton
    lateinit var radioBanana : RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup = findViewById(R.id.radioGroup)
        radioApple = findViewById(R.id.radioApple)
        radioOrange= findViewById(R.id.radioOrange)
        radioBanana = findViewById(R.id.radioBanana)

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId){
                R.id.radioApple -> Toast.makeText(applicationContext, "사과", Toast.LENGTH_SHORT).show()
                R.id.radioOrange -> Toast.makeText(applicationContext, "오렌지", Toast.LENGTH_SHORT).show()
                R.id.radioBanana -> Toast.makeText(applicationContext, "바나나", Toast.LENGTH_SHORT).show()
            }
        }
    }
}