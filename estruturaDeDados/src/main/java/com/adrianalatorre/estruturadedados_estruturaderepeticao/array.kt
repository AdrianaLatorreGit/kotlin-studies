package com.adrianalatorre.estruturadedados_estruturaderepeticao

class array {
}

//fun main() {
//    var array: Array<String> = Array(10) { "" }
//    var array1: DoubleArray = DoubleArray(2) { i -> 1.0 * i }
//
//    array1[0] = 5.0
//    array1.set(1, 15.0)
//
//    println(array1[0])
//    println(array1.get(1))
//}

//fun main() {
//    var mutableList: MutableList<Int> = mutableListOf()
//    var lista: List<String> = listOf("Valor1", "Valor2")
//
//    mutableList.add(5)
//    mutableList.add(8)
//
//    println(mutableList.size)
//    mutableList.remove(0)
//    mutableList[0] = 1
//    mutableList.set(0,7)
//    println(mutableList[0])
//    println(lista.get(0))
//}


fun main() {
    var mutableMap: MutableMap<String, String> = mutableMapOf()
    var map: Map<Int, Int> = mapOf(Pair(5, 10))

    println(mutableMap.contains("Adriana"))
    mutableMap["Adriana"] = "Programadora"
    println(mutableMap.contains("Adriana"))
    mutableMap.put("Adriana", "Programadora Kotlin")
    println(mutableMap.get("Adriana"))
    println(mutableMap["Joana"])
}