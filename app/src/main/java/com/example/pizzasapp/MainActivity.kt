package com.example.pizzasapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn_continuar = findViewById<AppCompatButton>(R.id.btn_continuar);

        btn_continuar.setOnClickListener() {

            var intent = Intent(this, OrdenarActivity::class.java);
            startActivity(intent);

        }
    }
}