package com.example.examen2eimds

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUsername = findViewById<EditText>(R.id.etUsername)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val user = etUsername.text.toString()
            if (user.isNotEmpty()) {
                Toast.makeText(this, "Bienvenid@ $user", Toast.LENGTH_SHORT).show()
                
                // Navegar a ProfileActivity
                val intent = Intent(this, ProfileActivity::class.java)
                startActivity(intent)
            } else {
                etUsername.error = "Ingresa tu nombre"
            }
        }
    }
}