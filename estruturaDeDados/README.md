package com.adrianalatorre.estruturadedados

class array {
}

//===============ARRAY==============

fun main() {

    var array: Array<Int> = Array(5) { 0 }
    var array2: IntArray = IntArray(5)

    //Salva o valor no index 2
    array[2] = 2

    //Salva o valor 4 no index 3
    array.set(3, 4)

    //Imprime o valor no index 0
    println(array[0])

    //Imprime o valor no index 1
    println(array.get(1))
}

//==============LISTAS (Nao tem tamanho definido)================

fun main() {

    var mutableList: MutableList<Int> = mutableListOf()
    var list: List<Int> = listOf(1)

    //Adiciona o valor ao final da lista
    mutableList.add(1)

    //Adiciona o valor 4 na posicao 0 da lista
    mutableList.add(0, 4)

    //Ordena lista
    mutableList.sort()

    //Remove elemento na posicao 0
    mutableList.remove(0)

    //Salva o valor 5 na posicao 0
    mutableList.set(0, 5)

    //Salva o valor 5 na posicao 0
    mutableList[0] = 5

    //Pega o conteudo salvo na posicao 1 da lista
     mutableList.get(1)

    //Pega o conteudo salvo na posicao 1 da lista
    mutableList[1]
}

//==============MAP================

fun main() {

    var mutableMap: MutableMap<String,String> = mutableMapOf()
    var map: Map<Int,String> = mapOf(Pair(1,"teste"))

    //Adiciona a chave1 no valor1
    mutableMap.put("chave1", "valor1")

    //Salva o valor2 na chave1
    mutableMap["chave1"] = "valor2"

    //Salva o valor3 na chave1
    mutableMap.set("chave1", "valor3")

    //Le o valor associado a chave1
    mutableMap["chave1"]

    //Le o valor associado a chave1
    mutableMap.get("chave1")

    //Verifica se existe a chave
    mutableMap.contains("chave1")

    //Verifica se existe o valor
    mutableMap.containsValue("valor1")

    //Retorna a lista com todas as chaves
    mutableMap.keys

    //Retorna a lista com todos os valores
    mutableMap.keys
}

![Screenshot from 2022-10-28 12-10-07](https://user-images.githubusercontent.com/101880897/198673376-5a8a0215-5006-43e3-a37f-bbad652b5a73.png)

![Screenshot from 2022-10-28 12-11-44](https://user-images.githubusercontent.com/101880897/198673384-17bb377e-adf6-434f-ac42-d7964c60c5ac.png)

![Screenshot from 2022-10-28 12-18-35](https://user-images.githubusercontent.com/101880897/198673386-5ee5b361-55d0-4ee8-90f4-bf244a2200de.png)


