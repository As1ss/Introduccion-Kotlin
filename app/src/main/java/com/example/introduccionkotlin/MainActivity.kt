package com.example.introduccionkotlin

import android.R.array
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    companion object {
        const val moneda = "EUR"
    }

    var saldo: Float = 360.54f
    var sueldo: Float = 764.82f
    var cantidad: Int = 5

    @RequiresApi(Build.VERSION_CODES.N)
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


        //Array simple
        var recibos: Array<String> = arrayOf("luz", "agua", "gas")
        recibos.set(2, "internet")
        recorrerArray(recibos)

        //Array bidimensional
        var matriz = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6, 7, 8, 9, 10),
            intArrayOf(11, 12, 13, 14)

        )
        //Recorrer el array bidimensional con un for
        for (i in (0 until matriz.size)) {
            println("Fila: ${i + 1}")
            for (j in (0 until matriz[i].size)) {
                println("Posicion[$i][$j] ==> ${matriz[i][j]}")
            }
        }

        //COLECCIONES

        //Colleción set ==> dimensión fija
        var clientesVIP: Set<Int> = setOf(1234, 4567, 8901)
        var setMezclado = setOf(4, 2.53, "casa", 'c')
        println("Clientes VIP: $clientesVIP")
        println("Numero de clientes VIP: ${clientesVIP.size}")

        if (clientesVIP.contains(1234))
            println("1234 es VIP")


        //Colección MutableSet ==> permite redimensionar la colección
        var clientes: MutableSet<Int> = mutableSetOf(1234, 4567, 8901, 4410)
        println("Clientes: $clientes")
        println("Número de clientes: ${clientes.size}")

        //Añadir elemento
        clientes.add(1912)
        println("Clientes: $clientes")
        println("Número de clientes: ${clientes.size}")

        //Eliminar elemento
        clientes.remove(4567)
        println("Clientes: $clientes")
        println("Número de clientes: ${clientes.size}")

        //Eliminar todos los elementos
        clientes.clear()
        println("Clientes: $clientes")
        println("Número de clientes: ${clientes.size}")

        //Colección List ==> dimensión fija
        var divisas: List<Char> = listOf('€', '$', '¥')
        println("Divisas: $divisas")
        println("Número de divisas: ${divisas.size}")

        //Colección MutableList ==> permite redimensionar la colección
        var bolsa: MutableList<String> = mutableListOf("Coca-cola", "Adidas", "Amazon", "Pfizer")
        println(bolsa)
        println("Número de empresas de bolsa: ${bolsa.size}")

        //Añadir elemento
        bolsa.add("Adobe")
        println(bolsa)
        println("Número de empresas de bolsa: ${bolsa.size}")

        //Eliminar elemento
        bolsa.remove("Pfizer") // Se puede eliminar indicando el elemento
        //  bolsa.removeAt(4) Se puede eliminar indicando el índice
        //  bolsa.removeLast() Se puede eliminar indicando la posición final de la colección
        println(bolsa)
        println("Número de empresas de bolsa: ${bolsa.size}")

        //Funciones varias que se pueden realizar sobre listas
        println("Primer elemento de bolsa: ${bolsa.first()}")
        println(bolsa.firstOrNull())
        println("Último elemento de bolsa: ${bolsa.last()}")
        println("El segundo elemento de bolsa: ${bolsa.elementAt(2)}")
        println("Muestra un booleano sobre la colección si está vacía: ${bolsa.none()}")

        //Eliminar todos los elementos
        bolsa.clear()
        println(bolsa)
        println("Número de empresas de bolsa: ${bolsa.size}")
        println("Muestra un booleano sobre la colección si está vacía: ${bolsa.none()}")
        //Esta función solo se puede realizar sobre las colecciones MutableList
        println(bolsa.firstOrNull()) //Muestra el primer elemento, si no existe muestra un null


        //Colección Map ==> dimensión fija
        var mapas: Map<Int, String> = mapOf(
            1 to "España",
            2 to "Italia",
            3 to "Alemania"
        )
        println(mapas)
        //Colección MutableMap ==> permite redimensionar la colección
        var inversiones: MutableMap<String, Float> = mutableMapOf()

        //Añadir par de claves en la colección
        inversiones.put("Coca-cola", 50f)
        println(inversiones)
        inversiones.put("Adobe", 50f)
        println(inversiones)
        //Eliminar par de claves de la colección
        // inversiones.remove("Coca-cola") ==> Esta función eliminará el elemento que contenga la clave descrita
        inversiones.remove("Coca-cola", 50f) // ==> Esta función eliminará el elemento si cumple con las dos condiciones,
        // que sea la clave descrita y el valor descrito
        println(inversiones)


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

    fun recorrerArray(array: Array<String>) {
        for (i in array) {
            println(i)
        }
        for (i in array.indices) {
            println(array.get(i))
        }
        for (i in 0..array.size - 1) {
            println("${i + 1}: ${array.get(i)}")
        }
        for (i in (0 until array.size)) {
            println("${i + 1}==> ${array.get(i)}")
        }
    }

    fun recorrerLista(lista: List<Char>) {
        for (i in lista) {
            println(i)
        }
        for (i in 0..lista.size - 1) {
            println(lista.get(i))
        }
        for (i in (0 until lista.size)) {
            print(lista[i])
        }
        for (i in lista.indices) {
            println(lista.get(i))
        }

    }
}