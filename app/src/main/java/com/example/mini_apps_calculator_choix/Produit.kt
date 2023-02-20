package com.example.mini_apps_calculator_choix

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Produit : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_produit)

        var firstNumber = findViewById<EditText>(R.id.firstNumber)
        var secondNumber = findViewById<EditText>(R.id.secondNumber)
        var pro = findViewById<Button>(R.id.btnProduit)
        var retour = findViewById<Button>(R.id.btnRtr)

        pro.setOnClickListener{
            var nb1 = firstNumber.text.toString().toInt()
            var nb2 = secondNumber.text.toString().toInt()
            var p = nb1 * nb2
            Toast.makeText(this,"$nb1 * $nb2 = $p", Toast.LENGTH_LONG).show()
        }

        retour.setOnClickListener{
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}