package com.example.tugas1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txtuser = findViewById(R.id.txtuser) as EditText
        var txtfas = findViewById(R.id.txtfas) as EditText
        var btnLogin = findViewById(R.id.btnLogin) as Button

        btnLogin.setOnClickListener {
            val Username = txtuser.text
            val Fassword = txtfas.text

            Toast.makeText(this@MainActivity , Username , Toast.LENGTH_LONG).show()
        }

    }
}