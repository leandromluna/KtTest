package com.example.demo

import com.example.demo.Controller.Controller
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {

    runApplication<DemoApplication>(*args)
    val c = Controller()
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
    print(c.edadUsuario(10))
}
