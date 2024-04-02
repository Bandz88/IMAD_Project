package com.example.imadproject

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val  historicalFigures = mapOf(
        95 to "Nelson Mandela",
        39 to "Martin Luther King Jr",
        82 to "Pele",
        20 to  "Pop Smoke",
        50 to "Micheal Jackson",
        76 to "Albert Einstein",
        51 to "Napoleon",
        74 to "Ronald Dahl",
        52 to "William Shakespeare",
        96 to "Elizabeth the ||",
    )


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val EnterText = findViewById<TextView> (R.id.EnterText)
        val MainBtn = findViewById<Button> (R.id.MainBtn)
        val NumberText = findViewById<EditText> (R.id.NumberText)
        val ClearBtn = findViewById<Button> (R.id.ClearBtn)
        val FinalTextView = findViewById<TextView> (R.id.FinalTextView)


        ClearBtn.setOnClickListener {
            NumberText.text.clear()

        }

        MainBtn.setOnClickListener {
            val age = EnterText.text.toString().toIntOrNull()
            age?.let {
                val figure = historicalFigures[age]
                if (figure !=null) {
                    FinalTextView.text = "You are $age years old, the same age as $figure when they past away"
                } else {
                    FinalTextView.text = "There is no historical figure in our records who was $age years old"
                }

            } ?:run {
                FinalTextView.text = "Please enter valid age"
            }

        }
    }
}