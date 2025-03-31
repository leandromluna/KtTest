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
            1 -> "Hola"
            2 -> "Chau"
            else -> "Error"
        }
    }

    fun saludar(dato: String) {
        when (dato) {
            "Hola", "Hi" -> println("Hola")
            else -> println("Primero se debe saludar")
        }
    }

    fun edadUsuario(edad: Int?): String {
        val edad = edad ?: 0

        return try {
            if (edad < 0) throw Exception("La edad es inexistente")
            when (edad) {
                in 1..17 -> "Es menor de edad"
                in 18..59 -> "Es mayor de edad"
                in 60..120 -> "Es de la tercera edad"
                else -> "Edad incorrecta"
            }
        } catch (e: NumberFormatException) {
            "El valor es incorrecto"
        } catch (e: Exception) {
            "Error: ${e.localizedMessage}"
        }

        /**
         * edad?.let {  // Entra solo si edad no es null
         *         if (it < 0) throw Exception("Edad inexistente")
         *         when (it) {
         *             in 1..17 -> println("Menor de edad")
         *             else -> println("Otro caso")
         *         }
         *     } ?: println("Edad es null")  // Caso null (opcional)
         */
    }


    fun printNombres(nombres: List<String>) {
        nombres.forEach(::println)
        //nombres.foreach{item -> prinlnt(item)}
        //nombres.foreach{prinlnt(it)}
    }
}
