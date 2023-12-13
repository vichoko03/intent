package com.example.ultimointento
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val registerbtn: Button = findViewById(R.id.registerbtn)

        registerbtn.setOnClickListener {
            val Intent = Intent(this, Inicio::class.java)
            startActivity(Intent)
        }
    }
}
