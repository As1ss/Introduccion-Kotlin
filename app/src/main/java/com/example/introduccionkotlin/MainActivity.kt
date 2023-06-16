package com.example.introduccionkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    companion object {
        const val moneda = "EUR"
    }
    var saldo: Float =360.54f
    var sueldo  = 764.82
    var cantidad: Int = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fecha = "16/06/2023"
        var nombre = "Alexis"
        var vip: Boolean = false
        var inicial: Char='A'
        var saludo ="Hola "+nombre


        println(saludo)
    }
}