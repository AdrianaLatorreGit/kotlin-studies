package com.adrianalatorre.nullsafety

class Condicionais {
}

fun main() {
    var numero1 = 20
    var numero2 = 10
    var numero3 = 12

//    if (numero1 > numero2 && numero1 > numero3) {
//        println("Maior numero")
//    } else if (numero1 > numero2) {
//        println("Maior que numero 2 e menor que numero3")
//    } else if (numero1 > numero3) {
//        println("Maior que numero3 e menor que numero2")
//    } else {
//        println("Menor que todos")
//    }


  val resultado =  when {
        numero1 > numero2 && numero1 > numero3 -> "Maior numero"
        numero1 > numero2 -> "Maior que numero 2 e menor que numero3"
        numero1 > numero3 -> "Maior que numero3 e menor que numero2"
        else -> "Menor que todos"
    }

    println(resultado)
}
