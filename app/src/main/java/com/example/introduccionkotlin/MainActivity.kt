package com.example.introduccionkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    companion object {
        const val moneda = "EUR"
    }

    var saldo: Float = 360.54f
    var sueldo: Float = 764.82f
    var cantidad: Int = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fecha = "16/06/2023"


        var nombre = "Alexis"
        var vip: Boolean = true
        var inicial: Char = 'A'
        var saludo = "Hola " + nombre

        if (vip == true) {
            saludo += ", te queremos mucho."
        } else {
            saludo += ", quieres ser vip? paga la cuota."
        }
        var mes = fecha.subSequence(3, 5).toString().toInt()
        when (mes) {
            1, 2, 3 -> println("En invierno no hay ofertas de inversiones")
            4, 5, 6 -> println("En primavera hay ofertas de inversiones con el 1.5% de interés")
            7, 8, 9 -> println("En verano hay ofertas de inversioens con el 2.5% de interés")
            10, 11, 12 -> print("En otoño hay ofertas de inversiones con el 3.5% de interés")
            else -> println("La fecha es errónea")

        }
        println(saludo)

        var a: Boolean = true
        var b: Boolean = true
        var c: Boolean = false
        var d: Boolean = false

        //Operadores lógicos

        a && b //&& = AND
        a || b //|| = OR

        a && c
        a || c

        !d // != NOT (NEGACION)


        //Operadores aritméticos
        /*
                var a: Int = 5 + 5 //10
                var b: Int = 10 - 2 //8
                var c: Int = 3 * 4 //12
                var d: Int = 10 / 5 //2
                var e: Int = 10 % 3 //1
                var f: Int =
                    10 / 6 //1 , deberia ser decimal periodico pero como el tipo de dato es INT solo se queda con el número entero

                var aPreIncremento: Int = 5
                var bPreDecremento: Int = 5
                var cPostIncremento: Int = 5
                var cPostDecremento: Int = 5


                println("Valor inicial: " + aPreIncremento) //5
                println("Valor incrementado: " + ++aPreIncremento) //Incrementa en uno , salida 6
                println("Valor final: " + aPreIncremento) //6

                println("Valor inicial: " + bPreDecremento) //5
                println("Valor decrementado: " + --bPreDecremento) //Decrementa en uno , salida 4
                println("Valor final: " + bPreDecremento)

                println("Valor inicial: " + cPostIncremento) //5
                println("Valor al incrementar: " + cPostIncremento++) //Muestra el valor y después lo incrementa , salida 5
                println("Valor final: " + cPostIncremento) //6
                println("Valor inicial: " + cPostDecremento) //5
                println("Valor al decrementar: " + cPostDecremento--) //Muestra el valor y después lo decrementa, salida 5
                println("Valor final: " + cPostDecremento) //4

                saldo += sueldo

                saldo++
        */
        //Operadores de comparación
        /*
                a == b
                a != b
                a > b
                a < b
                a >= b
                a <= b
        */
    }
}