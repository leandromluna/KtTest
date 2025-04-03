package com.example.demo

import com.example.demo.Controller.Controller
import com.example.demo.Controller.Nota
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {

    runApplication<DemoApplication>(*args)
    val c = Controller()
    val nota1 = Nota("Nota1", "Contenido1")
    val nota2 = Nota("Nota2", "Contenido2", Date())
    //c.mostrameMensaje();
    //c.mostrarFecha();
    //c.ejemplo("Auto", 200);
    //print(c.calcularImpuestos(10_000.00, 16.0));
    //print(c.calcularImpuestos(10_000.0))
    //print(c.saludo(10))
    //c.saludar("Necesito ayuda")
    //print(c.edadUsuario(4412))
    val empleados = arrayListOf("Jesus", "Jose", "Gabriel")
    //c.printNombres(empleados);
    //print(c.edadUsuario(10))

//    println("""
//        *** Nota ***
//        Nombre: ${nota1.nombre}
//        Contenido: ${nota1.contenido}
//        Fecha: ${nota1.fechaCreacion}
//    """.trimIndent())

    val listaNotas = arrayListOf<Nota>()
    listaNotas.add(nota1)
    listaNotas.add(nota2)
    listaNotas.forEach{
        println("""
            ${it.nombre}
            ${it.contenido}
            ${it.fechaCreacion}
            --------------------
        """.trimIndent())
    }
}
