package com.kishore.activitylifecycle

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var titleName:String?="Avengers"
    lateinit var btnLogout:Button
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences=getSharedPreferences(getString(R.string.preferences),Context.MODE_PRIVATE)

        setContentView(R.layout.scrollview_layout)


        titleName=sharedPreferences.getString("title","The Avengers")
        title=titleName

        btnLogout=findViewById(R.id.btnLogout)
        btnLogout.setOnClickListener {
            startActivity(Intent(this@MainActivity,LoginActivity::class.java))
            sharedPreferences.edit().clear().apply()
            finish()
        }
    }

}