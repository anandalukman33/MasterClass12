package com.course.masterclass12

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.my_button)
        val text = findViewById<TextView>(R.id.text_hello)
        var timesClicked = 0

        button.setOnClickListener {
            timesClicked = timesClicked.plus(1)
            text.text = getString(R.string.ahaYouClickMe) + " -- " + timesClicked.toString()
            Snackbar.make(it, getString(R.string.ahaYouClickMe) + " -- " + timesClicked.toString(), Snackbar.LENGTH_SHORT).show()
        }
    }
}