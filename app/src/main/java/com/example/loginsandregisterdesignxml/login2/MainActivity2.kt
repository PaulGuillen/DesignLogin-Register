package com.example.loginsandregisterdesignxml.login2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.loginsandregisterdesignxml.R

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun ViewRegister(view: View) {
        val i = Intent(this,RegisterActivity2::class.java)
        startActivity(i)
    }
}