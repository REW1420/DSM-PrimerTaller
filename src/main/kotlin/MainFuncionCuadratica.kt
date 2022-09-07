fun main(args: Array<String>) {

    val dado = Dado()
    val dado2= DadoRecuadro()

    dado.tirar()
    dado.imprimir()
    dado.traducir()

    dado2.tirar2()
    dado2.imprimir()
    dado2.impresionEnAsteristicos()
    dado2.imprimirAsteriscos()


}