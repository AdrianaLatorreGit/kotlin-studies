/*
 Collections ou coleções -> são implementações de estruturas de dados
 - Set -> não permite elementos duplicados, é mais rápido que o ArrayList, não mantém a ordem dos elementos
 - Map -> é uma implementação chave/valor
 */


fun main(arg: Array<String>) {

	var itens = hashSetOf("a","b","c","c")
    
    println(itens)
    
}
  
  ![Screenshot from 2022-11-24 10-44-32](https://user-images.githubusercontent.com/101880897/203799664-e8d7a3cf-2ecb-4382-afde-05526b7799b8.png)

  fun main(arg: Array<String>) {

	var itens = hashSetOf("a","b","c","c")
    
    for( item in itens ){
        println(item)
    }
    
}
  
  ![Screenshot from 2022-11-24 10-48-56](https://user-images.githubusercontent.com/101880897/203800005-6b671cfb-d88e-4033-81a8-f875f94b3278.png)

  
  fun main(arg: Array<String>) {

	var map = hashMapOf(
        "urso" to "Animal que hiberna",
        "cao" to "Melhor amigo do homem e da mulher"
    )
  
  map.put("passaro", "Gosta de voar")

  println(map)
    
}
  
  ![Screenshot from 2022-11-24 10-56-06](https://user-images.githubusercontent.com/101880897/203801599-04c41b8a-587a-45d1-b1a6-af9b4b3a9f9d.png)
  
  
  fun main(arg: Array<String>) {

	var map = hashMapOf(
        "urso" to "Animal que hiberna",
        "cao" to "Melhor amigo do homem e da mulher"
    )
    
    map.put("passaro", "Gosta de voar")
    //map.remove("passaro")
    
    for(item in map){
        println(item)
    }
    
   for(item in map.values){
        println(item)
    }
   
    for(item in map.keys){
        println(item)
    }
    
}
  
  ![Screenshot from 2022-11-24 11-12-23](https://user-images.githubusercontent.com/101880897/203805060-4b237c7d-2f34-43f4-bcac-0197fb6b72d3.png)

  
  
 
