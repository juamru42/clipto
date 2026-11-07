package com.example.clipboardkb

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(32, 32, 32, 32)
        }

        val title = TextView(this).apply {
            text = "ClipKeyboard - Portapapeles y Teclado"
            textSize = 20f
            setPadding(0, 0, 0, 32)
        }
        layout.addView(title)

        val btnSettings = Button(this).apply {
            text = "1. Activar Teclado en Ajustes"
            setOnClickListener {
                startActivity(Intent(Settings.ACTION_INPUT_METHOD_SETTINGS))
            }
        }
        layout.addView(btnSettings)

        val info = TextView(this).apply {
            text = "\n¡Listo! Después de activar el teclado, mantén presionado cualquier campo de texto en WhatsApp, Notas o el navegador para cambiar de teclado y usar tu portapapeles."
            setPadding(0, 32, 0, 0)
        }
        layout.addView(info)

        setContentView(layout)
    }
}
