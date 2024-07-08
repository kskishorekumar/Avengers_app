package com.kishore.activitylifecycle

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var et1: EditText
    lateinit var et2: EditText
    lateinit var b: Button
    lateinit var fp: TextView
    lateinit var register: TextView

    companion object {
        var validmobilenumber = mutableListOf("9363172293", "9943666881", "9715282189", "7010470645", "8675094060")
        var validpassword = mutableListOf("kishore", "ratchu", "indira", "sambath", "kumar")
    }

    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences(getString(R.string.preferences), Context.MODE_PRIVATE)
        val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false)
        setContentView(R.layout.activity_new)
        if (isLoggedIn) {
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        title = "Log In"

        et1 = findViewById(R.id.et1)
        et2 = findViewById(R.id.et2)
        b = findViewById(R.id.b)
        fp = findViewById(R.id.fp)
        register = findViewById(R.id.register)

        b.setOnClickListener {
            val mobilenumber = et1.text.toString()
            val password = et2.text.toString()
            var name = "User"
            val intent = Intent(this@LoginActivity, MainActivity::class.java)

            val index = validmobilenumber.indexOf(mobilenumber)
            if (index != -1 && validpassword[index] == password) {
                name = when (password) {
                    "kishore" -> "kishore"
                    "ratchu" -> "ratchu"
                    "indira" -> "indira"
                    "sambath" -> "sambath"
                    "kumar" -> "kumar"
                    else -> "User"
                }
                save(name)
                startActivity(intent)
                Toast.makeText(this@LoginActivity, "Welcome $name", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@LoginActivity, "Invalid Log In", Toast.LENGTH_SHORT).show()
            }
        }

        register.setOnClickListener {
            val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onPause() {
        super.onPause()
        finish() //to finish the activity when paused
    }

    fun save(title: String) {
        sharedPreferences.edit().putBoolean("isLoggedIn", true).apply()
        sharedPreferences.edit().putString("title", title).apply()
    }
}
