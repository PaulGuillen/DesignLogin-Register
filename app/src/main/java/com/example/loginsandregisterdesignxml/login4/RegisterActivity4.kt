package com.example.loginsandregisterdesignxml.login4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.loginsandregisterdesignxml.R

class RegisterActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register4)
    }

    fun ViewLogin(view: View) {
        val i = Intent(this,MainActivity4::class.java)
        startActivity(i)
    }
}