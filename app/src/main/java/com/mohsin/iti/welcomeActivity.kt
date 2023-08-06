package com.mohsin.iti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mohsin.iti.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userInput = intent.getStringExtra("userInput")
        binding.WelcomeTextView.text ="  Welcome\n$userInput"

        Toast.makeText(this,"Hi\n$userInput",Toast.LENGTH_LONG).show()




    }
}