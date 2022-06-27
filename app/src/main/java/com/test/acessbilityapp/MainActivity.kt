package com.test.acessbilityapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn_Sign_up: Button = findViewById(R.id.sign_up_btn)
        btn_Sign_up.setOnClickListener({ view ->
            val moveIntent = Intent(this@MainActivity, SignUpActivity::class.java)
            startActivity(moveIntent)
        })

        val btn_Sign_In: Button = findViewById(R.id.sign_in_btn)
        btn_Sign_In.setOnClickListener({ view ->
            val moveToDashboard = Intent(this@MainActivity, TabActivity::class.java)
            startActivity(moveToDashboard)
        })
    }
}
