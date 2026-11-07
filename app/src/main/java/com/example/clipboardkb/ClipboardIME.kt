package com.example.clipboardkb

import android.inputmethodservice.InputMethodService
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ScrollView

class ClipboardIME : InputMethodService() {

    override fun onCreateInputView(): View {
        val scrollView = ScrollView(this)
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(16, 16, 16, 16)
        }

        val sampleSnippets = listOf(
            "📋 Saludo: ¡Hola! ¿Cómo estás?",
            "📍 Dirección: Av. San Martín 123",
            "📧 Email: humaru2659@gmail.com",
            "📞 Teléfono: +54 9 ..."
        )

        for (text in sampleSnippets) {
            val button = Button(this).apply {
                this.text = text
                setOnClickListener {
                    currentInputConnection?.commitText(text, 1)
                }
            }
            layout.addView(button)
        }

        scrollView.addView(layout)
        return scrollView
    }
}
