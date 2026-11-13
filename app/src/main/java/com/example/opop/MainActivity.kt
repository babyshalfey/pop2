package com.example.opop

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Находим наш инпут из библиотеки
        val inputLayout = findViewById<com.google.android.material.textfield.TextInputLayout>(R.id.myCustomInput)

        // Находим само поле ввода (чтобы проверить, что ввели)
        val editText = inputLayout.editText

        // Просто для теста: как только пользователь что-то ввел и нажал Enter, проверяем текст
        editText?.setOnEditorActionListener { _, _, _ ->
            val text = editText.text.toString()

            // Если ввели неправильно (например, без собачки @), показываем ошибку
            if (!text.contains("@")) {
                inputLayout.error = "Введите корректный email (с символом @)"
            } else {
                inputLayout.error = null // Убираем ошибку, если всё ок
            }
            true
        }
    }
}