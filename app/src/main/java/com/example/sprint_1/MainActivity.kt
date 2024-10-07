package com.example.sprint_1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val emailTxt: EditText = findViewById(R.id.email)
        val senhaTxt: EditText = findViewById(R.id.senha)
        val botao: Button = findViewById(R.id.btn)
        val mensagem: TextView = findViewById(R.id.msg)

        botao.setOnClickListener {
            val email = emailTxt.text.toString()
            val senha = senhaTxt.text.toString()

            if (email.isNotEmpty() && senha.isNotEmpty()) {
                mensagem.text = "Login efetuado com sucesso!"
            } else {
                mensagem.text = "Informe seu email e senha!"
            }
        }
    }
}