/*
* Esse adaptador é uma interface que define como um adaptador
* deve se comportar
* VOCÊ NÃO IRÁ ALTERAR ESSA INTERFACE
* */
interface Adaptador {

    /*
    * Esse método deve retornar a quantidade de itens que você quer exibir
    * Para isso pode utilizar qualquer tipo de lista, recomendo usar um listOf mesmo ;)
    * */
    fun quantidadeItens() : Int

    /*
    * Esse método é responsável por retornar cada item da lista, utilizando a posição
    * O método irá retornar uma string, e você pode montar o Layout como Quiser
    * */
    fun montarLayoutParaItem(posicao: Int) : String
}

/*
* Esse componente é que será responsável por fazer a listagem dos itens
* para isso passe para o atributo um adaptador
* VOCÊ NÃO IRÁ ALTERAR ESSA CLASSE
* */
class ComponenteListagem {

    var adaptador: Adaptador? = null

    fun executar(){
        if( adaptador != null ){

            val quantidadeItens = adaptador!!.quantidadeItens()
            for ( posicao in 0 until quantidadeItens){
                val item = adaptador!!.montarLayoutParaItem(posicao)
                println( item )
            }

        }else{
            println("Configure um adaptador para prosseguir")
        }
    }

}

class MeuAdaptador(
    lista: List<Paciente>
) : Adaptador{
    private val listaItens = lista
    override fun quantidadeItens(): Int {
        return listaItens.size
    }

    override fun montarLayoutParaItem(posicao: Int): String {
//        val nome = listaItens[posicao]
//        val retorno  = "$posicao) $nome - "
//        return retorno

        val paciente = listaItens[posicao]
        var item = "${paciente.nome} - (${paciente.idade} anos) \n"
        item += "-----------"
        return item

    }
}

data class Paciente(
    val nome : String,
    val idade: Int
)

fun main() {

    //Lista de itens
   // val listaItens = listOf("jamilton", "ana", "maria", "pedro", "joão")
    val listaItens = listOf(
        Paciente("Ana", 30),
        Paciente("Adriana", 38),
        Paciente("Pedro", 21),
        Paciente("Marcela", 54)
    )

    val componenteListagem = ComponenteListagem()
    componenteListagem.adaptador = MeuAdaptador(listaItens)
    componenteListagem.executar()![Screenshot from 2023-03-21 11-00-39](https://user-images.githubusercontent.com/101880897/226630247-b71cc0ee-4455-4df0-91ce-063af8ab15fb.png)


}


![Screenshot from 2023-03-21 11-00-39](https://user-images.githubusercontent.com/101880897/226630369-99e6d176-e499-44ef-b555-6027ec920da3.png)








