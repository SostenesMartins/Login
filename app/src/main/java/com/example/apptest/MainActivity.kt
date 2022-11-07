package com.example.apptest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtEmail: TextView = findViewById(R.id.text_email)
        val txtPassword: TextView = findViewById(R.id.text_password)
        val btnLogin: Button = findViewById(R.id.btn_login)

    }
}