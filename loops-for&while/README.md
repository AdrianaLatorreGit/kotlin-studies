fun main(arg: Array<String>) {
    
    var numero =1
 	while( numero <= 5 ){
     println("Executado : $numero") 
     numero++
  }
   
   for( numero in 1..5 ){
       println("Execurado : $numero")
   }
 
 var postagens = arrayOf(
 	"Descoberto um novo método de tratamento para diabétes!",
     "Novo curso Android lançado",
     "Bolsa de valores opera em alta de 2%"
 )
 
 /*for( postagem in postagens ){
     println(postagem)
 }
 */
 
 for( (indice, postagem) in postagens.withIndex() )
 	println("$indice - $postagem")
}
                   
Executado : 1
Executado : 2
Executado : 3
Executado : 4
Executado : 5
Execurado : 1
Execurado : 2
Execurado : 3
Execurado : 4
Execurado : 5
0 - Descoberto um novo método de tratamento para diabétes!
1 - Novo curso Android lançado
2 - Bolsa de valores opera em alta de 2%
