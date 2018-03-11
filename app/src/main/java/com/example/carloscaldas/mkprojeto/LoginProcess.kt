package com.example.carloscaldas.mkprojeto

import android.content.Context
import android.widget.Toast

/**
 * Created by carlos.caldas on 3/11/2018.
 */
class LoginProcess(applicationContext : Context, login : String) {

    val applicationContext:Context
    val login:String

    init {
        this.applicationContext = applicationContext
        this.login = login
    }

    public fun loginUser (){

        Toast.makeText(applicationContext,"Bem vindo $login", Toast.LENGTH_LONG).show()
    }

    /*Toast.makeText(applicationContext,"Bem vindo $login", Toast.LENGTH_LONG).show()
    */
}