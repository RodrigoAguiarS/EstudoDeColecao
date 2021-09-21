package me.rodri

fun main() {
    val joao = funcionario("João", 1000.0)
    val pedro = funcionario("Pedro", 2000.0)
    val maria = funcionario("Maria", 4000.0)

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{
        println(it)
    }
    println("______________________________")
    println(funcionarios.find {
        it.nome == "Maria" })
}
data class funcionario(val nome: String, val salario: Double){
    override fun toString(): String =
        """
            nome:    $nome
            salario: $salario
        """.trimIndent()
}