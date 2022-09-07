class DadoRecuadro: Dado() {

    val asteriscos: MutableList<String> = mutableListOf()

    fun tirar2 (){
        numero = (1..100).random()
    }



    override fun imprimir (){
        println(numero)


        }
    fun impresionEnAsteristicos(){
        var mensaje : String = "*"
        for (x in 1..numero){
           asteriscos.add("*")
        }


    }fun imprimirAsteriscos (){
        println("$numero"+ " = "+asteriscos)
    }
}