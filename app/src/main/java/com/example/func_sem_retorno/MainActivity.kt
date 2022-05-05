package com.example.func_sem_retorno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        btn_enviar.setOnClickListener(){
            mensagem()
        }
    }

    fun mensagem(){

        val msg = edt_mensagem.text.toString()
        tv_resultado.text = msg
    }
}