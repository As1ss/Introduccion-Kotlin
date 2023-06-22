package tareaseccion2.TareaSeccion2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.introduccionkotlin.R

class TareaSeccion2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /* 1. Usa un bucle do-while para mostrar por pantalla una cuenta regresiva del 9 al 0 igual que cuando hay un
        lanzamiento de un cohete por parte de la NASA.*/


        var i: Int = 9
        println("El lanzamiento se realizara en:")
        do {
            println(i)
        } while (9 >= 0)

    }


}