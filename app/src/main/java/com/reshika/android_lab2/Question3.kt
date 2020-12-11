package com.reshika.android_lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Question3 : AppCompatActivity() {
    private lateinit var etAdmin: EditText
    private lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question3)

        etAdmin = findViewById(R.id.etAdmin)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            login()
        }
    }

    private fun login(){

        val text = etAdmin.text.toString()
        if(text == "admin"){
            Toast.makeText(this, "You're logged in", Toast.LENGTH_LONG).show()

        }else{
            Toast.makeText(this, "You're not logged in", Toast.LENGTH_LONG).show()
        }

    }
}