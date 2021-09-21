package me.rodri

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)
    for (salario in salarios){
        println(salario)
    }
    println("___________________")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Média salario: ${salarios.average()}")
    //metedo de filtro.
    val salariosFilter2500 = salarios.filter {
        it > 2500.0
    }
    println("___________________")
    salariosFilter2500.forEach {
        println(it)
    }

}