open class Animal {
    
   open fun dormir(){
        println("Dormir")
    }
    
    fun correr(){
        println("Correr")
    }
    
}


class Cao : Animal() {
    override fun dormir(){
        super.dormir()
        println("como um cão")
    }
    
    fun latir(){
        println("Latir")
    }
    
}

class Passaro : Animal(){
    
   override fun dormir(){
       super.dormir()
       println("como um pássaro")
   }
    
}

fun main(arg: Array<String>) {
    
    val cao = Cao()
    cao.dormir()
    cao.correr()
    cao.latir()

    val passaro = Passaro()
    passaro.dormir()
    passaro.correr()
    
}
  
   ![Screenshot from 2022-11-21 11-41-43](https://user-images.githubusercontent.com/101880897/203082998-6e8f6705-de33-4899-9aea-72b0fd3d26ca.png)
  
