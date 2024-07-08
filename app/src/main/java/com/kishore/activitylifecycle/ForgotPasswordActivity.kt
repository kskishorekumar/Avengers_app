package com.kishore.activitylifecycle

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordActivity : AppCompatActivity() {

    lateinit var etMobileNumber: EditText
    lateinit var etSecretCode: EditText
    lateinit var etNewPassword: EditText
    lateinit var btnResetPassword: Button

    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        sharedPreferences = getSharedPreferences(getString(R.string.preferences), Context.MODE_PRIVATE)

        etMobileNumber = findViewById(R.id.etMobileNumber)
        etSecretCode = findViewById(R.id.etSecretCode)
        etNewPassword = findViewById(R.id.etNewPassword)
        btnResetPassword = findViewById(R.id.btnResetPassword)

        btnResetPassword.setOnClickListener {
            val mobileNumber = etMobileNumber.text.toString()
            val secretCode = etSecretCode.text.toString()
            val newPassword = etNewPassword.text.toString()

            if (mobileNumber.isNotEmpty() && secretCode == "3488" && newPassword.isNotEmpty()) {
                resetPassword(mobileNumber, newPassword)
            } else {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun resetPassword(mobile: String, newPassword: String) {
        val editor = sharedPreferences.edit()
        val size = sharedPreferences.getInt("size", 0)
        for (i in 0 until size) {
            if (sharedPreferences.getString("mobile_$i", null) == mobile) {
                editor.putString("password_$i", newPassword)
                editor.apply()
                Toast.makeText(this, "Password reset successful!", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
                return
            }
        }
        Toast.makeText(this, "Mobile number not found", Toast.LENGTH_SHORT).show()
    }
}
