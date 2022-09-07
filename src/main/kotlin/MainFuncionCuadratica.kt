fun main(args: Array<String>) {

    var opcion : Int = 0
    var variables = CapturaDeDatos()



do {


    variables.CapturarDatoA()
    variables.CapturarDatoB()
    variables.CapturarDatoC()

    variables.Raiz()
    variables.primerRaultado()
    variables.segundoRaultado()

    println("1. Volver a calcular " +
            "2. Salir")
    opcion= readln().toInt()
}while (opcion!=2)



}