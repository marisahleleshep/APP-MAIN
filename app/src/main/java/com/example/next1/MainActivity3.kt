package com.example.next1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var btnn5: Button = findViewById(R.id.btnn5)
        btnn5.setOnClickListener { val intent= Intent(this,MainActivity4::class.java);
            startActivity(intent)}
        var btnp3: Button = findViewById(R.id.btnp3)
        btnp3.setOnClickListener { val intent= Intent(this,MainActivity2::class.java);
            startActivity(intent)}
    }
}