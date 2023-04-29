package com.example.next1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var btnn2: Button = findViewById(R.id.btnn2)
        btnn2.setOnClickListener { val intent= Intent(this,MainActivity3::class.java);
            startActivity(intent)}
        var btnp1: Button = findViewById(R.id.btnp1)
        btnp1.setOnClickListener { val intent= Intent(this,MainActivity::class.java);
            startActivity(intent)}
    }
}