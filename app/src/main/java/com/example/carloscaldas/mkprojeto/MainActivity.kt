package com.example.carloscaldas.mkprojeto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(icicle: Bundle?) {
        super.onCreate(icicle)
        setContentView(R.layout.activity_main)
        onClick(R.id.btLogin) {onClickLogin()}
    }
    fun onClickLogin(){
        val login = getTextString(R.id.etUser)

    }
}
