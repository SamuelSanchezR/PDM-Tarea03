package com.example.pizzasapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class OrdenarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ordenar)

        var btn_ordenar = findViewById<AppCompatButton>(R.id.btn_ordenar);

        btn_ordenar.setOnClickListener() {
            var intent = Intent(this, OrdenListaActivity::class.java);
            startActivity(intent);
        }
    }
}