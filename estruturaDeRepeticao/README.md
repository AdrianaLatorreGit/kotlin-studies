package com.adrianalatorre.estruturaderepeticao

class EstruturaRepeticao {
}

//===============FOR=============

fun main() {

    for (i in 0..100 step 10){
        println(i)
    }
    for (i in 10 downTo 0 step 1){
        println(i)
    }
    var limit = 100
    for(i in 0..limit){
        println(i)
    }
    
}

//============FOR listas e arrays=========

fun main() {

    for (i in array.indices) {
        println(array[1])
    }
    for (text: String in listString){

    }
    for (item in list) println(item)
    
}

//===============WHILE==========

fun main() {

    var cont = 0
    while (cont < 10 || cont % 2 == 0) {
        println(cont)
        cont++
    }
    
}

