class DadoRecuadro: Dado() {

    fun tirar2 (){
        numero = (1..100).random()
    }



    override fun imprimir (){
        println(numero)


        }
    fun impresionEnAsteristicos(){
        var mensaje : String = "*"
        for (x in 1..numero){
            println("*")
        }
    }
}