package com.example.demo.Controller

import java.util.Date

class Controller {

    fun mostrameMensaje() {
        val pais: String = "Mexico"
        val edad = 30
        var numero = 10
        numero = 20

        println(
            """
            *** Datos ***
            Pais: $pais
            Edad: $edad años
        """.trimIndent()
        )

    }

    fun mostrarFecha() {
        println(
            """
            Mensaje: Hola
            Fecha: ${Date()}
        """.trimIndent()
        )
    }

    fun ejemplo(datoUno: String, datoDos: Int) {
        println(
            """
            Vehiculo: $datoUno
            Km: $datoDos
        """.trimIndent()
        )
    }

    fun calcularImpuestos(salario: Double, porcentajeImpuestos: Double = 15.0): Double {
        val totalImpuestos = (salario / 100) * porcentajeImpuestos

        return totalImpuestos;
    }

    fun saludo(dato: Int): String {
        return when (dato) {
            1 ->  "Hola"
            2 ->  "Chau"
            else -> "Error"
        }
    }

    fun saludar(dato: String) {
        when (dato) {
            "Hola", "Hi" -> println("Hola")
            else -> println("Primero se debe saludar")
        }
    }

    fun edadUsuario(dato: Int) {
        if (dato < 0) throw Exception("La edad es inexistente")
        try {
            when (dato) {
                in 1..17 -> println("Es menor de edad")
                in 18..59 -> println("Es mayor de edad")
                in 60..120 -> println("Es de la tercera edad")
                else -> println("Edad incorrecta")
            }
        } catch (e: NumberFormatException) {
            println("El valor es incorrecto")
        } catch (e: Exception) {
            println("Error: ${e.localizedMessage}")
        }

    }

    fun printNombres(nombres: List<String>) {
        nombres.forEach(::println)
        //nombres.foreach{item -> prinlnt(item)}
        //nombres.foreach{prinlnt(it)}
    }
}