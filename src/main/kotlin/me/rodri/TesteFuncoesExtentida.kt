package me.rodri

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )
    println("__________________")
    println(salarios.somatoria())

    println("__________________")
    println(salarios.media())
}