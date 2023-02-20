package com.example.mini_apps_calculator_choix

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var somme = findViewById<Button>(R.id.btnS)
        var difference = findViewById<Button>(R.id.btnD)
        var produit = findViewById<Button>(R.id.btnP)



        somme.setOnClickListener{
            var intent = Intent(this,Somme::class.java)
            startActivity(intent)
        }

        difference.setOnClickListener{
            var intent = Intent(this,Difference::class.java)
            startActivity(intent)
        }

        produit.setOnClickListener{
            var intent = Intent(this,Produit::class.java)
            startActivity(intent)
        }

    }
}