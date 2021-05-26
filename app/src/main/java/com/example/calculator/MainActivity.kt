package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number1 : EditText = findViewById(R.id.num1)
        val number2 : EditText = findViewById(R.id.num2)
        val additon : Button = findViewById(R.id.add)
        val  subtraction : Button = findViewById(R.id.sub)
        val  multiplication : Button = findViewById(R.id.mul)
        val  division : Button = findViewById(R.id.div)
        val answer : TextView = findViewById(R.id.ans)

        additon.setOnClickListener{
            val n1 = Integer.parseInt(number1.text.toString())
            val n2 = Integer.parseInt(number2.text.toString())
            Toast.makeText(this, "addition : ${n1.plus(n2)}", Toast.LENGTH_SHORT).show()
            answer.text = "${n1.plus(n2)}"
        }

        subtraction.setOnClickListener{
            val n1 = Integer.parseInt(number1.text.toString())
            val n2 = Integer.parseInt(number2.text.toString())
            Toast.makeText(this, "Subtraction : ${n1 - n2}", Toast.LENGTH_SHORT).show()
            answer.text = "${n1 - n2}"
        }

        multiplication.setOnClickListener{
            val n1 = Integer.parseInt(number1.text.toString())
            val n2 = Integer.parseInt(number2.text.toString())
            Toast.makeText(this, "Multiplication : ${n1 * n2}", Toast.LENGTH_SHORT).show()
            answer.text = "${n1 * n2}"
        }

        division.setOnClickListener{
            val n1 = Integer.parseInt(number1.text.toString())
            val n2 = Integer.parseInt(number2.text.toString())
            if(n2 != 0) {
                Toast.makeText(this, "Division : ${n1 / n2}", Toast.LENGTH_SHORT).show()
                answer.text = "${n1/n2}"

            }
            else {
                Toast.makeText(this, "Invalid division", Toast.LENGTH_SHORT).show()
                answer.text = "Not defined!!"

            }

        }
    }
}