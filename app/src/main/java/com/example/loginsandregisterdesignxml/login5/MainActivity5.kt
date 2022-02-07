package com.example.loginsandregisterdesignxml.login5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.loginsandregisterdesignxml.R
import com.example.loginsandregisterdesignxml.login4.RegisterActivity4

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
    }

    fun ViewRegister(view: View) {
        val i = Intent(this, RegisterActivity5::class.java)
        startActivity(i)
    }
}