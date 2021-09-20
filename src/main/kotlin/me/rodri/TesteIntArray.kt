package me.rodri

fun main() {
    val valor = IntArray(5)

    valor[0]= 1
    valor[1]= 7
    valor[2]= 6
    valor[3]= 3
    valor[4]= 2

    for (values in valor) {
        println(values)
    }
    println("---------------------------")
    valor.forEach {
        println(it)
    }
    println("---------------------------")
    for (index in valor.indices){
        println(valor[index])
    }
    //ordenando por padrão no menor para o mair com sort()
    println("---------------------------")
    valor.sort()
    for (values in valor) {
        println(values)
    }
}