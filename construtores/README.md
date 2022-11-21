
class Casa (var cor: String, var vagasGaragem: Int) {
    
    //propriedades
    /*
    var cor: String
    var vagasGaragem : Int
    */
    
    /*
     init{
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }
    */
    
    /*
     constructor(cor: String, vagasGaragem: Int){
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }
    */
    
    //métodos
    
    fun detalhesCasa(){
        println("A casa tem a cor: $cor, vagas: $vagasGaragem")
    }
    
}

fun main(arg: Array<String>) {
    
    val casa = Casa("Amarela", 2)
    
    casa.detalhesCasa()
}

![Screenshot from 2022-11-21 10-59-08](https://user-images.githubusercontent.com/101880897/203073671-22bff2ef-705e-4350-b88f-64bf438b2100.png)
