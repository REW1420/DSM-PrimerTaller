fun main(args: Array<String>) {
    var validaciones = Condiciones()
    var opcion : Int = 0
    var variables = CapturaDeDatos()
    var op = Operaciones()


do {


    variables.CapturarDatoA()
    variables.CapturarDatoB()
    variables.CapturarDatoC()

    variables.primeraRaiz()
    variables.primerRaultado()
    variables.segundoRaultado()

    println("1. Volver a calcular " +
            "2. Salir")
    opcion= readln().toInt()
}while (opcion!=2)



}