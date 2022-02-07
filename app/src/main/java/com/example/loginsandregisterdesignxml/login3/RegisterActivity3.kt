package com.example.loginsandregisterdesignxml.login3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.loginsandregisterdesignxml.R

class RegisterActivity3 : AppCompatActivity() {

    var buttonBack : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register3)

        buttonBack = findViewById(R.id.btn_volver)
        buttonBack?.setOnClickListener { ViewMain() }
    }

    private fun ViewMain() {
        val i = Intent(this, MainActivity3::class.java)
        startActivity(i)
    }
}