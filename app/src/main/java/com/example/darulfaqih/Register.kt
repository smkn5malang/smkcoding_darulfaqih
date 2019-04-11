package com.example.darulfaqih

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_sign_up.*

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnSignUp1.setOnClickListener {
            val i = Intent (this@Register, SignUp::class.java)
            startActivity(i)
        }

        btnLogin.setOnClickListener {
            val i = Intent (this@Register, Home::class.java)
            startActivity(i)
        }
    }
}
