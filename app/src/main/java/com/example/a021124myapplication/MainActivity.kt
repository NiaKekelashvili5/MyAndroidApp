package com.example.a021124myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailInput = findViewById<EditText>(R.id.emailInput)
        val okayButton = findViewById<Button>(R.id.okayButton)
        val nextButton = findViewById<Button>(R.id.nextButton)

        okayButton.setOnClickListener {
            //email to second activityis gadaawodos when Okay button is clicked
            val email = emailInput.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("email", email)
            startActivity(intent)
        }

        nextButton.setOnClickListener {
            //Go to second activity when Next button is clicked
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
