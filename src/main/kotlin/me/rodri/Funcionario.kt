package me.rodri

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String =
        """
            nome:    $nome
            salario: $salario
        """.trimIndent()
}