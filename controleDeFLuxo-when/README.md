fun main(arg: Array<String>) {
    
  var opcao = 3
    
    /*
    when(opcao){
        1,2 -> {
            println("Café puro")
            println("Leite separado")
        }
        3 -> println("Chocolate quente")
        
        else -> {
            println("Nenhuma opção selecionada")
       		println("Selecione uma opção")
        }
    }
    */
    
   var resultado = when ( opcao ){
        
        1 -> "Café puro"
        2 -> "Chocolate quente"
        
        else -> "Nenhuma opção selecionada"
    }
   
   println(resultado)
   
}
