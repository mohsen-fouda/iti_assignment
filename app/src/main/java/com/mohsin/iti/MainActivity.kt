package com.mohsin.iti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.mohsin.iti.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()  {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.LoginButton.setOnClickListener {

            visibility()

            val intent = Intent(this, WelcomeActivity::class.java)
            val userInput = binding.userNameEditText.text.toString()
            intent.putExtra("userInput", userInput)
            startActivity(intent)
        }

    }


    private fun visibility() {
        binding.ProgressBar.visibility = View.VISIBLE
        binding.emailEditText.visibility = View.GONE
        binding.passwordEditText.visibility = View.GONE
        binding.userNameEditText.visibility = View.GONE
        binding.LoginButton.visibility = View.GONE

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)


        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            R.id.welcome -> {
                val intent = Intent(this, WelcomeActivity::class.java)
                val userInput = binding.userNameEditText.text.toString()
                intent.putExtra("userInput", userInput)
                startActivity(intent)
            }
            R.id.exit -> {
                val eBuilder = AlertDialog.Builder(this)
                eBuilder.setTitle("Exit")
                eBuilder.setMessage( "Are you sure you want Exit ? ")
                eBuilder.setPositiveButton("YES"){
                  Dialog,which-> finish()
                }

                eBuilder.setPositiveButton("NO"){
                  Dialog,which->
                    Toast.makeText(this , "done", Toast.LENGTH_LONG).show()
                }
                val createBuild : AlertDialog = eBuilder.create()
                createBuild.show()
            }
        }

        return true
    }



}