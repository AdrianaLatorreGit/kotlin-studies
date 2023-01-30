/*
 * Pode-se dizer, a grosso modo, que uma interface é um contrato que quando assumido por uma classe deve ser implementado
 * 
 * Interface é utilizada pois podemos ter muitos objetos (classes) que podem possuir a mesma ação (métodos), porém, podem executa-las de maneira diferente
 */

open class Cidadao(){
    fun direitosDeveres(){
        println("Todo o cidadão tem direitos e deveres")
    }
}

interface Presidente {
    
    fun ganharEleicao()
    
}

interface pai {
    fun temFilho()
}


 class Obama: Cidadao(), Presidente, pai {
     override fun ganharEleicao(){
         println("Ganhar Eleição nos EUA")
     }
     
     override fun temFilho(){
         println("Tem filho")
     }
        
    }
 
 	class Adriana: Cidadao(), Presidente {
        override fun ganharEleicao(){
         println("Ganhar Eleição no Brasil")
    }
    }


fun main(arg: Array<String>) {

   val adriana = Adriana()
   adriana.direitosDeveres()
   adriana.ganharEleicao()
   
   val obama = Obama()
   obama.direitosDeveres()
   obama.ganharEleicao()
   obama.temFilho()
    
}
  
  
  ![Screenshot from 2022-11-23 14-44-32](https://user-images.githubusercontent.com/101880897/203614235-59cb74db-4507-457c-a66d-645ee99b5aab.png)
  
  
  ![Screenshot from 2023-01-18 15-07-46](https://user-images.githubusercontent.com/101880897/215485946-91530ad2-84d7-4a76-9305-2c892ea59d6d.png)

![Screenshot from 2023-01-18 15-08-26](https://user-images.githubusercontent.com/101880897/215485979-14eeffbb-3b3f-4422-8b04-7861ae499221.png)


  
  
