package singleton

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    Singleton.printVar()
    Singleton.aux = "This is the new name var"
    Singleton.printVar()

}

object Singleton {

    init {
        println("Init class Singleton invoked!")
    }

    var aux = "Hi! I´m the var."

    fun printVar () = println("This is the var-> $aux")

}

