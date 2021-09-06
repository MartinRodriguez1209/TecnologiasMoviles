package com.proyecto.pruebas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(baseContext, R.string.toast_onCreate, Toast.LENGTH_LONG).show()
        test()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(baseContext, R.string.toast_onPause, Toast.LENGTH_SHORT).show()
    }

    fun test() {
        lateinit var mi_boton: Button //creo mi boton
        lateinit var mi_segundo_boton: Button //creo el segundo boton
        lateinit var texto: TextView  //creo mi textview a mostrar
        var contador = 0 //contador auxiliar

        lateinit var toast: Toast //creo mi toast


        //asociacion a variables declaradas
        mi_boton = findViewById(R.id.boton)
        mi_segundo_boton = findViewById(R.id.segundo_boton)
        texto = findViewById(R.id.textView)

        //edito toast
        toast =
            Toast.makeText(baseContext, R.string.toast_boton, Toast.LENGTH_LONG)//inicio el toast
        toast.setGravity(Gravity.TOP or Gravity.LEFT, 0, 0) //cambio posicion del toast

        //funcion cuando tap al boton
        mi_boton.setOnClickListener {
            contador++
            /* Toast.makeText(baseContext, "Hola Android", Toast.LENGTH_LONG).show()*/
            texto.visibility = View.VISIBLE //hago el textview visible
            texto.setText(String.format(getString(R.string.holamundo),contador)) // getString(R.string.holamundo) devuelve el valor de R como un string
            toast.show()
            setTitle(R.string.title_boton)
            Snackbar.make(it, R.string.snackbar_texto, Snackbar.LENGTH_LONG).show()
        }

        mi_segundo_boton.setOnClickListener {
            var intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }


    }

    /*  TODO contador
     */
}