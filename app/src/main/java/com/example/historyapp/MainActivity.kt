package com.example.historyapp


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.historyapp.R.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        //Declaring each widget as a variable
        val editTextNumber = findViewById<EditText>(R.id.editTextNumber)
        val clickMeButton = findViewById<Button>(R.id.clickMeButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val button2 = findViewById<Button>(R.id.button2)

        //Programming the clear button
        button2.setOnClickListener {
            editTextNumber.text.clear()
            resultTextView.text = ""
        }
        //Declaring the clickMeButton to generate an answer
        clickMeButton.setOnClickListener {
            //convert to Int Or Null to only accept whole number inputs
            val age = editTextNumber.text.toString().toIntOrNull()
            //Initialise answer with an empty string
            var answer: String = ""

            if (age != null) {
                //calculate answer based off age input
                answer = when (age) {
                    in 20..29 -> {
                        " Sylvia Plath died at the age of 22 \n she was a famous american poet"
                    }

                    in 30..35 -> {
                        "Princess Diana died at age 32 \n She was the Princess of the united kingdom through marriage and a while known british public figure"
                    }

                    in 35..39 -> {
                        "Guy Fawkes died at the age of 36 \n he was a member of an infamous group which unsuccessfully plotted the murder of king james."
                    }

                    in 40..49 -> {
                        " John F kennedy died at the age of 45 \n The 35th President of the United States and the youngest person to be elected to the position."
                    }

                    in 50..59 -> {
                        "Sarah Elisabeth Goode died at this age 57 \n One of the 1st american women granted a patent, for the invention of a folding cabinet bed"
                    }

                    in 60..65 -> {
                        "Theodore Roosevelt died at the age of 60 \n The 26th president of the United States"
                    }

                    in 65..69 -> {
                        "Marco Polo died at the age of 69 \n A famous Venetian trader who  travelled across Asia during the Mongolian empire"
                    }

                    in 70..79 -> {
                        "Leonardo Fibonacci died at the age of 79 \n He significantly contributed to the revival of ancient mathematics and played a key part in it. "
                    }

                    in 80..89 -> {
                        "John Lewis died at the age of 80 \n He was an american civil rights activist"
                    }

                    in 90..99 -> {
                        "Nelson Mandela died at the age of 92 \n A South African anti-apartheid activist and politician who served as the first president of South Africa"
                    }

                    else -> {
                        "Age is out of range. Please enter in a number between 20 and 100"
                    }
                }
                resultTextView.text = "Answer:$answer"
            }


        }
    }
}




















