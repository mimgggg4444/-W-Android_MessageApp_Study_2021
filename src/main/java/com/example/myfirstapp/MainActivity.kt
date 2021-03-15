package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    called when the user taps the send button
fun sendMessage(view: View){

    //이 오류를 어떻게 해야하는가.
    val editText = findViewById<EditText>(R.id.editText)
    val message = editText.text.toString()

    //이 오류를 어떻게 해야하는가.
    val intent = Intent(this, DisplayMessageActivity::class.java).apply {
        putExtra(EXTRA_MESSAGE, message)
    }
    
    startActivity(intent)

    }
}

