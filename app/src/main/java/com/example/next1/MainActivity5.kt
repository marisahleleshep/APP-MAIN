package com.example.next1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        var btnp5: Button = findViewById(R.id.btnp5)
        btnp5.setOnClickListener { val intent= Intent(this,MainActivity4::class.java);
            startActivity(intent)}

    }
}