package com.buzztech.armorfleet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.buzztech.armorfleet.ui.auth.AuthActivity
import com.buzztech.armorfleet.utility.postDelayed

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postDelayed(2000) {
            startActivity(Intent(this@MainActivity, AuthActivity::class.java))
        }
    }
}