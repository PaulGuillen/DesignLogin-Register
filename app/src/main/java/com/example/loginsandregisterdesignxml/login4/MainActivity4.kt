package com.example.loginsandregisterdesignxml.login4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.loginsandregisterdesignxml.R

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
    }

    fun ViewLogin(view: View) {
        val i = Intent(this,RegisterActivity4::class.java)
        startActivity(i)
    }

}