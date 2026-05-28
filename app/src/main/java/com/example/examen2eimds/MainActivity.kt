package com.example.examen2eimds

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            val user = findViewById<EditText>(R.id.etUsername).text.toString()
            val pass = findViewById<EditText>(R.id.etPassword).text.toString()

            if (pass == "abc123") {
                val intent = Intent(this, ProfileActivity::class.java)
                intent.putExtra("USER_NAME", user)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Contraseña incorrecta", Toast.LENGTH_SHORT).show()
            }
        }
    }
}