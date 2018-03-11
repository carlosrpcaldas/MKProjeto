package com.example.carloscaldas.mkprojeto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btLogin.setOnClickListener {
            onClickLogin()
        }

        //Toast.makeText(this, this.toString(), Toast.LENGTH_LONG).show()

    }

     fun onClickLogin() {

        val textView: TextView = findViewById<TextView>(R.id.etUser) as TextView
        val login : String = textView.text.toString()
          Toast.makeText(applicationContext,"Bem vindo $login", Toast.LENGTH_LONG).show()
    }



}