package com.example.meuprimeiroprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tvresult = findViewById<TextView>(R.id.textview_result)
        val tvClassicacao = findViewById<TextView>(R.id.textview_Classificacao)
        
        val result = intent.getFloatExtra("EXTRA_RESULT", 0.1f)

        tvresult.text = result.toString()


        val classificacao = if(result <18.5f){
            "ABAIXO DO PESO"
        } else if (result in 18.5f..24.9f){
            "NORMAL"
        }else if (result in 25f..29.9f){
            "SOBRE PESO"
        }else if (result in 30f..39.9f){
            "OBESIDADE"
        }else {
            "OBSEDADE GRAVE"
        }

        tvClassicacao.text = getString(R.string.message_classificacao, classificacao)






    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }

}