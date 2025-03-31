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

}