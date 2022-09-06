import java.util.*
open class Dado {
    var nummero: Int = 0

    fun tirar (){
        nummero = (1..100).random()
    }
    fun imprimir (){
        println(nummero)
    }

}