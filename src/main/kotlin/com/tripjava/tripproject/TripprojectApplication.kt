package com.tripjava.tripproject

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TripprojectApplication : CommandLineRunner{
    override fun run(vararg args: String?) {
        println("========")
    }

}

fun main(args: Array<String>) {
    runApplication<TripprojectApplication>(*args)
}
