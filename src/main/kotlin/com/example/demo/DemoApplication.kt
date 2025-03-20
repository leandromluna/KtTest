package com.example.demo

import com.example.demo.Controller.Controller
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {

    runApplication<DemoApplication>(*args)
    val controller = Controller()
    controller.mostrameMensaje();
}
