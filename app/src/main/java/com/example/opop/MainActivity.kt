package com.example.opop

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<MaterialButton>(R.id.myCustomButton)
        button.isEnabled = true
        button.text = "Кнопка работает!"
        button.setOnClickListener {
            button.text = "1 раз нажать можно"
            button.isEnabled = false}
    }
}