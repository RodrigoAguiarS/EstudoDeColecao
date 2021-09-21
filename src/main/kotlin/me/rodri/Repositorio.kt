package me.rodri

class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun create(id: String, valor: T){
        map[id] = valor
    }
    fun remove(id: String) = map.remove(id)

    fun findById(id: String) = map[id]

    fun findAll() = map.values
}