package com.example.mini_apps_calculator_choix

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Difference : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_difference)

        var firstNumber = findViewById<EditText>(R.id.firstNumber)
        var secondNumber = findViewById<EditText>(R.id.secondNumber)
        var dif = findViewById<Button>(R.id.btnDifference)
        var retour = findViewById<Button>(R.id.btnRtr)

        dif.setOnClickListener{
            var nb1 = firstNumber.text.toString().toInt()
            var nb2 = secondNumber.text.toString().toInt()
            var d = nb1 - nb2
            Toast.makeText(this,"$nb1 - $nb2 = $d", Toast.LENGTH_LONG).show()
        }

        retour.setOnClickListener{
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

}