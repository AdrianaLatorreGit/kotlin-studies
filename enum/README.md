/*

 Enum (Enumeração) -> É um tipo de dados que consiste em um conjunto de constantes 
 
 */

enum class StatusPedido {
    
    PROCESSANDO, APROVADO, REPROVADO
    
}

class Pedido {
    
    var status: StatusPedido = StatusPedido.PROCESSANDO
    
}


fun main(arg: Array<String>) {

	val pedido = Pedido()
    pedido.status = StatusPedido.APROVADO
    
    
    if( pedido.status == StatusPedido.PROCESSANDO ){
        println("Pedido está sendo processado")
    }else if( pedido.status == StatusPedido.APROVADO ){
        println("Pedido foi aprovado")
    }
    
}
  
  
  ![Screenshot from 2022-11-25 10-42-12](https://user-images.githubusercontent.com/101880897/203997926-82d1bb1e-20ec-4048-b414-4da2bde82a86.png)

  
