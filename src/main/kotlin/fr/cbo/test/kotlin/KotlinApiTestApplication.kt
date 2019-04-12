package fr.cbo.test.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinApiTestApplication

fun main(args: Array<String>) {
    runApplication<KotlinApiTestApplication>(*args)
}
