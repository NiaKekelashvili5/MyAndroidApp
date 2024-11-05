package com.example.a021124myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //TextView and Button by their IDs reference
        val textViewWelcome = findViewById<TextView>(R.id.textViewWelcome)
        val textViewCounter = findViewById<TextView>(R.id.textViewCounter)
        val buttonClick = findViewById<Button>(R.id.buttonClick)

        //Get the email from the Intent and set it in the welcome TextView
        val email = intent.getStringExtra("email")
        textViewWelcome.text = "Welcome back\n$email"

        //Click button to increase the counter by 2 each time it's clicked
        buttonClick.setOnClickListener {
            counter += 2
            textViewCounter.text = counter.toString()
        }
    }
}


