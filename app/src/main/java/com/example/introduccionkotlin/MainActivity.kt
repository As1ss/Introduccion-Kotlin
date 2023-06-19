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

        val fecha = "01/06/2023"


        var nombre = "Alexis"
        var vip: Boolean = true
        var inicial: Char = 'A'
        var saludo = "Hola " + nombre

        if (vip == true) {
            saludo += ", te queremos mucho."
        } else {
            saludo += ", quieres ser vip? paga la cuota."
        }
        var dia = fecha.subSequence(0, 2).toString().toInt()
        if (dia == 1) {
            ingresar_sueldo()
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

        var pin: Int = 1234
        var intentos: Int = 0
        var clave_ingresada: Int = 1232

        do {
            println("Ingrese el pin")
            println("Clave ingresada: $clave_ingresada")
            intentos++
            clave_ingresada++
            println("El pin introducido es erróneo, tienes " + intentos + "/3 restantes")


        } while (intentos < 3 && clave_ingresada != pin)

        if (intentos == 3) {
            println("Lo siento has superado el numero de intentos")
        } else if (clave_ingresada == pin) {
            println("Pin correcto, acceso garantizado")
            println("Bienvenid@ " + nombre)
        }

        ingresar_dinero(50.5f)
        retirar_dinero(40f)
        retirar_dinero(50f)
        retirar_dinero(2000f)


        /*Operadores lógicos

          var a: Boolean = true
          var b: Boolean = true
          var c: Boolean = false
          var d: Boolean = false

          a && b //&& = AND
          a || b //|| = OR

          a && c
          a || c

          !d // != NOT (NEGACION)
  */
        /*Operadores aritméticos

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
        /*Operadores de comparación

               a == b
               a != b
               a > b
               a < b
               a >= b
               a <= b
       */
    }

    fun mostrar_saldo() {
        println("Tienes $saldo$moneda")
    }

    fun ingresar_sueldo() {
        saldo += sueldo
        println("Se ha ingresado el sueldo: $sueldo$moneda satisfactoriamente.")
        mostrar_saldo()
    }

    fun ingresar_dinero(cantidad: Float) {
        saldo += cantidad
        println("Se ha ingresado la cantidad: $cantidad$moneda satisfactoriamente")
        mostrar_saldo()
    }

    fun retirar_dinero(cantidad: Float) {
        if (verificarCantidad(cantidad)) {
            saldo -= cantidad
            println("Se ha retirado la cantidad: $cantidad$moneda satisfactoriamente")
            mostrar_saldo()
        } else
            println("No se puede retirar más cantidad de saldo que posees")


    }

    fun verificarCantidad(cantidad: Float): Boolean {
        if (cantidad > saldo) return false
        else return true

    }
}