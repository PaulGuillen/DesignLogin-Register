package com.example.loginsandregisterdesignxml.login5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.loginsandregisterdesignxml.R

class RegisterActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register5)
    }

    fun ViewLogin(view: View) {
        val i = Intent(this, MainActivity5::class.java)
        startActivity(i)
    }
}