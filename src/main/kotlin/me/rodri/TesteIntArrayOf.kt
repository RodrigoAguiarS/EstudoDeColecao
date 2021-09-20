package me.rodri

fun main() {
    val valor = intArrayOf(2, 3, 4, 1, 10, 7)
    valor.forEach {
        println(it)
    }
    println("_____________________")
    valor.sort()
    valor.forEach {
        println(it)
    }
}