package com.example.homework22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val tv = findViewById<TextView>(R.id.tv)

        myfunc()

        button.setOnClickListener{
            tv.setText((count++).toString())
        }
    }
    fun myfunc(){
        delay(3000)

        }
    }
}