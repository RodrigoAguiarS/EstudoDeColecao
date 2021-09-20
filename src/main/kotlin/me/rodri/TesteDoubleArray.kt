package me.rodri

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    salarios.forEach {
        println(it)
    }
    println("____________________________")
    //Aumentando os sálarios em 10%
    salarios.forEachIndexed{index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach {
        println(it)
    }
    println("____________________________")
    val bonus = doubleArrayOf(1500.0, 3000.0, 500.0)
    bonus.sort()
    bonus.forEach {
        println(it)
    }
}