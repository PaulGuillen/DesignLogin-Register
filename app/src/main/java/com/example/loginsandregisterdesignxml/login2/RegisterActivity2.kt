package com.example.loginsandregisterdesignxml.login2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.loginsandregisterdesignxml.R
import com.example.loginsandregisterdesignxml.login1.MainActivity

class RegisterActivity2 : AppCompatActivity() {

    var imageButton : ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register2)

        imageButton = findViewById(R.id.back_to_home)
        imageButton?.setOnClickListener { goToMain()}
    }

    private fun goToMain(){
        val i = Intent(this@RegisterActivity2,MainActivity2::class.java)
        startActivity(i)
    }
}