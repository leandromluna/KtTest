package com.example.demo.Controller

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ControllerTest {

    private val controller = Controller()

    @Test
    fun testSaludo() {
        val result = controller.saludo(1)
        assertEquals("Hola", result)
    }

    @Test
    fun testUsuarioEdad() {
        assertEquals("Es menor de edad", controller.edadUsuario(5))
    }

    @Test
    fun testUsuarioEdadNull(){
        assertEquals("Edad incorrecta", controller.edadUsuario(null))
    }

    @Test
    fun testUsuarioEdadNegativa(){
        assertEquals("Error: La edad es inexistente", controller.edadUsuario(-3))
    }

    @Test
    fun testUsuarioEdadSuperior(){
        assertEquals("Edad incorrecta", controller.edadUsuario(150))
    }


}