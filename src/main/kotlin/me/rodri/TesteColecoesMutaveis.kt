package me.rodri

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")
    println("__________LIST_____________")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("_________________________")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("_________________________")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("__________SET_____________")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }
    println("_________________________")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("_________________________")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }

}