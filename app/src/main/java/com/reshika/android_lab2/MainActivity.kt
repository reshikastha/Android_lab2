package com.reshika.android_lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
        private lateinit var increase: TextView
        private lateinit var button: Button
        var count =0

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            increase= findViewById(R.id.increase)
            button = findViewById(R.id.button)


            button.setOnClickListener {
                count++;
                Increase(count);
            }
        }
        fun Increase(c:Int){
            increase.setText(c.toString())
        }
    }
