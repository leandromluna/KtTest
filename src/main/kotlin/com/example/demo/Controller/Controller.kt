package com.example.demo.Controller

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

        println("Hola, como estas")
    }
}