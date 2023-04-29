package com.example.next1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        var btnN4: Button = findViewById(R.id.btnN4)
        btnN4.setOnClickListener { val intent= Intent(this,MainActivity5::class.java);
            startActivity(intent)}
        var btnp4: Button = findViewById(R.id.btnp4)
        btnp4.setOnClickListener { val intent= Intent(this,MainActivity3::class.java);
            startActivity(intent)}
    }
}