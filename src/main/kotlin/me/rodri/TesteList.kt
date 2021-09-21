package me.rodri

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{
        println(it)
    }
    println("______________________________")
    println(funcionarios.find {
        it.nome == "Maria" })

    println("______________________________")
    funcionarios.
    sortedBy {
        it.salario}.
    forEach{
        println(it)}
    println("______________________________")
    funcionarios.
    sortedBy {
        it.tipoContratacao}.
    forEach{
        println(it)}
}
