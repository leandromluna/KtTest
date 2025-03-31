package com.example.demo.Controller

import java.util.Date

class Controller {

    fun mostrameMensaje() {
        val pais: String = "Mexico"
        val edad = 30
        var numero = 10
        numero = 20

        println("""
            *** Datos ***
            Pais: $pais
            Edad: $edad años
        """.trimIndent())

    }

    fun mostrarFecha(){
        println("""
            Mensaje: Hola
            Fecha: ${Date()}
        """.trimIndent())
    }

    fun ejemplo(datoUno: String, datoDos: Int) {
        println("""
            Vehiculo: $datoUno
            Km: $datoDos
        """.trimIndent())
    }

    fun calcularImpuestos(salario: Double, porcentajeImpuestos: Double = 15.0): Double {
        val totalImpuestos = (salario / 100) * porcentajeImpuestos

        return totalImpuestos;
    }

    //TODO: Refactor return when (dato) y -> "Hola" etc
    fun elseIF(dato: Int): String {
        var valor = "";
        when (dato) {
            1 -> {
                valor = "Hola"
            }
            2 -> {
                valor = "Chau"
            }
            else -> {
                valor = "Error"
            }
        }
        return valor

    }

    fun elseIF2(dato: String) {
        when(dato){
            "Hola", "Hi" -> println("Hola")
            else -> println("Primero se debe saludar")
        }
    }

    fun elseIF3(dato: Int) {
        when(dato){
            in 1..17 -> println("Es menor de edad")
            in 18..59 -> println("Es mayor de edad")
            in 60..120 -> println("Es de la tercera edad")
            else -> println("Edad incorrecta")
        }
    }

    fun printNombres(nombres: List<String>) {
        nombres.forEach(::println)
        //nombres.foreach{item -> prinlnt(item)}
        //nombres.foreach{prinlnt(it)}
    }
}