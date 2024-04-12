// Create an app that has both a Landscape and Portrait mode.
// Create 2 different layouts utilizing space.
// Have a button, image and editText widgets on each of the screen
// When the button is clicked it should display what the user entered in the editText widget


package com.example.turningyourphoneproject

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // define view variables
        val button: Button = findViewById(R.id.idSubmitButton)
        val input: EditText = findViewById(R.id.idTextEdit)
        val display: TextView = findViewById(R.id.idTextDisplay)

        // display text entered by the user in a text view
        button.setOnClickListener {
            val receivedInput = input.text.toString()
            input.setText("") // clears the text edit field
            display.text = receivedInput
        }
    }
}