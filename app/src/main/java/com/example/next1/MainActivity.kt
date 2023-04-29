package com.example.next1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn1: Button= findViewById(R.id.btn1)
        btn1.setOnClickListener { val intent= Intent(this,MainActivity2::class.java);
            startActivity(intent)}

    }
}