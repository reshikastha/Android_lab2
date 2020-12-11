package com.reshika.android_lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.TextView

class SelectedOption : AppCompatActivity() {
    private lateinit var textView2: TextView
    private lateinit var rbMale: RadioButton
    private lateinit var rbFemale: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_option)

        textView2 = findViewById(R.id.textView2)
        rbMale = findViewById(R.id.rbMale)
        rbFemale = findViewById(R.id.rbFemale)

        check()
    }

    fun check() {
        rbMale.setOnClickListener {
            if (rbMale.isChecked) {
                println("male")
                textView2.text = rbMale.text.toString()
            }
        }
        rbFemale.setOnClickListener {
            if (rbFemale.isChecked) {
                println("Female")
                textView2.text = rbFemale.text.toString()
            }
        }
    }
}
