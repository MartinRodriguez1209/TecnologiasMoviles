package com.proyecto.pruebas

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SegundaActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)
        test()
    }

    fun test(){
        Toast.makeText(baseContext, R.string.toast_cambio_activity, Toast.LENGTH_LONG).show()
    }
}