package com.example.darulfaqih

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_get_started.*

class GetStarted : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)

        btnNext.setOnClickListener {
            val i = Intent (this@GetStarted, Register::class.java)
            startActivity(i)
        }
    }
}
