package com.example.firechat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {
    public fun gotoLogin(view: View) {
        startActivity(Intent(this, LoginActivity::class.java))
    }

    public fun gotoReg(view: View) {
        startActivity(Intent(this, RegistrationActivity::class.java))
    }
}

