package com.test.acessbilityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btn_Sign_up: Button = findViewById(R.id.sign_up_btn)
        btn_Sign_up.setOnClickListener({ view ->
            val moveIntent = Intent(this@SignUpActivity, MainActivity::class.java)
            startActivity(moveIntent)
        })
    }
}