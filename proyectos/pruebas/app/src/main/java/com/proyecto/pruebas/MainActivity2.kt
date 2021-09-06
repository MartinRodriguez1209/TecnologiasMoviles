package com.proyecto.pruebas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        test()
    }

    fun test() {
        Toast.makeText(baseContext, R.string.toast_cambio_activity, Toast.LENGTH_LONG).show()
        lateinit var boton: Button
        var texto_nombre: EditText
        var texto_apellido: EditText



        boton = findViewById(R.id.boton_siguiente)
        texto_nombre = findViewById(R.id.edit_text_nombre) as EditText
        texto_apellido = findViewById(R.id.edit_text_apellido) as EditText

        var nombre: String
        var apellido: String
        boton.setOnClickListener {
            if (texto_nombre.text.isEmpty() or texto_apellido.text.isEmpty()) {
                Snackbar.make(it, R.string.snackbar_texto_vacio, Snackbar.LENGTH_LONG).show()
            } else {
                nombre = texto_nombre.text.toString()
                apellido = texto_apellido.text.toString()
                Toast.makeText(
                    baseContext,
                    "Nombre: " + nombre + " Apellido: " + apellido,
                    Toast.LENGTH_LONG
                ).show()
                val intent = Intent(this, MainActivity3::class.java)
                intent.putExtra("nombre", nombre)
                intent.putExtra("apellido", apellido)
                startActivity(intent)
            }
        }
    }
}