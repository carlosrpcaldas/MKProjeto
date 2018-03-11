package com.example.carloscaldas.mkprojeto

/**
 * Created by adriano.leite on 11/03/2018.
 */

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.example.carloscaldas.mkprojeto.MainActivity
import com.example.carloscaldas.mkprojeto.R

import com.example.carloscaldas.mkprojeto.R.anim.animacao_splash
import com.example.carloscaldas.mkprojeto.R.id.splash

class SplashScreen : AppCompatActivity() {

    //Tempo que nosso splashscreen ficará visivel
    private val SPLASH_DISPLAY_LENGTH = 4500

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        //Executando o método que iniciará nossa animação
        carregar()
    }

    private fun carregar() {
        val anim = AnimationUtils.loadAnimation(this,

                R.anim.animacao_splash)
        anim.reset()

        //Pegando o nosso objeto criado no layout
        val iv = findViewById<ImageView>(R.id.splash)
        if (iv != null) {
            iv.clearAnimation()
            iv.startAnimation(anim)
        }

        Handler().postDelayed({
            // Após o tempo definido irá executar a próximatela

            val intent = Intent(this@SplashScreen, MainActivity::class.java)

            intent.flags = Intent.FLAG_ACTIVITY_NO_ANIMATION

            startActivity(intent)
            this@SplashScreen.finish()
        }, SPLASH_DISPLAY_LENGTH.toLong())
    }
}