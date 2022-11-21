
class Casa {
    
    //propriedades
    var cor: String = ""
    
    //métodos
    fun abrirJanela(qtdJanelas: Int){
        println("Abrir janela total: $qtdJanelas")
    }
    
    fun abrirPorta(){
        println("Abrir porta")
    }
    
    fun abrirCasa(){
        //this.abrirJanela()
        this.abrirPorta()
    }
    
}

fun main(arg: Array<String>) {
    
    val casa = Casa()
    casa.cor = "Amarela"
    casa.abrirCasa()
    casa.abrirJanela(2)
    
    val casa2 = Casa()
    casa2.cor = "Vermelha"
    
    println(casa.cor)
    println(casa2.cor)

}
  
  ![Screenshot from 2022-11-21 10-26-14](https://user-images.githubusercontent.com/101880897/203066842-4cf3a084-9a5e-45a3-a95d-70f0ffcc40e4.png)

  
  
  
  
