package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperar os componentes EditText
        // Criar uma variavel e associar(=) o componente de UI<EditText>
        // Recuperar o botao da tela

        // Colocar acao no botao setOnClickListener
        // Recuperar o texto digitado no edt pedo

        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btnCalular = findViewById<Button>(R.id.btn_calcular)


        btnCalular.setOnClickListener {
            val peso = edtPeso.text
            val altura = edtAltura.text
            println("Roque acao do botao " + altura)
        }

    }
}