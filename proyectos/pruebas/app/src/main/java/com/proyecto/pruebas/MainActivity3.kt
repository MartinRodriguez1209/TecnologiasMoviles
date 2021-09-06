package com.proyecto.pruebas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        test()
    }

    fun test() {
        var text_view_datos : TextView
        text_view_datos = findViewById(R.id.textView2_nombre_apellido)
        text_view_datos.setText(String.format("hola %s %s",intent.getStringExtra("nombre"),intent.getStringExtra("apellido")))

    }
}