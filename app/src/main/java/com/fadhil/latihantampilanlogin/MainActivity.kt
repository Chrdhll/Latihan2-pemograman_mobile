package com.fadhil.latihantampilanlogin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var usernameInput: EditText
    lateinit var passwordInput: EditText
    lateinit var loginBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.username)
        passwordInput = findViewById(R.id.password)
        loginBtn = findViewById(R.id.btnlogin)

        loginBtn.setOnClickListener{
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            if(username == "admin" && password == "123456"){
                val intent = Intent(this,MainActivity2::class.java)

                startActivity(intent)
            } else {
                Toast.makeText(this,"Username atau Password salah", Toast.LENGTH_SHORT).show()
            }

        }


    }
}