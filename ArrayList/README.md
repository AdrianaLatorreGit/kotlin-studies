
/*

 Collections ou coleções -> são implementações de estruturas de dados
 - List -> Imutável, tamanho fixo, apenas para leitura
 - ArrayList -> Mutável, tamnho fixo, apenas para leitura
 
 */

/*

 	fun main(arg: Array<String>) {

	var listaItens = listOf("SP","RJ","MG")
    
    println(listaItens)
    
}

*/


fun main(arg: Array<String>) {

	var listaItens = arrayListOf("SP","RJ","MG")
    listaItens.add("BA")
   // listaItens.remove("SP")
   //listaItens.removeAt(0)
   //listaItens[0] = "MA"
    
    
    println(listaItens)
    println(listaItens.size)
    println(listaItens.isEmpty())
    
}
  
  
  ![Screenshot from 2022-11-24 10-32-04](https://user-images.githubusercontent.com/101880897/203796662-6eb14a85-c1b7-4264-9f9b-df75351729a3.png)
