package com.example.test2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    // These are the global variables
  //  var editName: EditText? = null
  //  var editPassword: EditText? = null
  //  var result: TextView? = null
  //  var buttonSubmit: Button? = null
  //  var buttonReset: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      //  editName = findViewById<View>(R.id.editName) as EditText
      //  editPassword = findViewById<View>(R.id.editPassword) as EditText
       // result = findViewById<View>(R.id.tvResult) as EditText
      //  buttonSubmit = findViewById<View>(R.id.buttonSubmit) as Button
      //  buttonReset = findViewById<View>(R.id.buttonReset) as Button

        val editName = findViewById<TextView>(R.id.editName)
        val editPassword = findViewById<TextView>(R.id.editPassword)
        val result = findViewById<TextView>(R.id.tvResult)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)
        val buttonReset = findViewById<Button>(R.id.buttonReset)


        /*
            Submit Button
        */buttonSubmit!!.setOnClickListener {
            val name = editName!!.text.toString()
            val password = editPassword!!.text.toString()
            result!!.text = "Name:\t$name\nPassword:\t$password"
        }

        /*
            Reset Button
        */buttonReset!!.setOnClickListener {
            editName!!.setText("")
            editPassword!!.setText("")
            result!!.text = ""
            editName!!.requestFocus()
        }
    }
}