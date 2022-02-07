package com.example.loginsandregisterdesignxml.login3

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ImageSpan
import android.view.Window
import android.widget.Button
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.loginsandregisterdesignxml.R

class MainActivity3 : AppCompatActivity() {

    var btn_register : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        btn_register = findViewById(R.id.btn_registrar)
        btn_register?.setOnClickListener { ViewRegister() }

    }

    private fun ViewRegister() {
        val i = Intent(this, RegisterActivity3::class.java)
        startActivity(i)
    }


}