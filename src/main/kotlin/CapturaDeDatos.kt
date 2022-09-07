import kotlin.math.pow
import kotlin.math.sqrt

open class CapturaDeDatos:numero() {

   open fun CapturarDatoA(){
        println("Ingrese el valor de A: ")
        a= readln().toInt()

    }

    open fun CapturarDatoB(){
        println("Ingrese el valor de B: ")
        b= readln().toInt()

    }

    open fun CapturarDatoC(){
        println("Ingrese el valor de C: ")
        c = readln().toInt()

       if (c == 0){
           println("C no puede ser 0")
           CapturarDatoC()
       }

    }



    var bPotencia = 0
    var ac = 0
    var total = 0
    var raizTotal = 0.0
    var bMasRaiz = 0.0
    var bMenosRaiz = 0.0
    var x1 = 0.0
    var x2 = 0.0
    var bNegativa = 0

    open fun Raiz(){
        println(a)
        println(b)
        println(c)

        bNegativa = (-b)
        bPotencia = b * b
        ac = (4 * (a * c))

        total = bPotencia - ac

        raizTotal = sqrt(total.toDouble())




    }fun primerRaultado(){
        bMasRaiz = ((bNegativa)+raizTotal)
        x1 = bMasRaiz / (2*a)
        println("El primer valor de X com b + raiz es: $x1")

    }fun segundoRaultado(){
        bMenosRaiz = ((bNegativa)-raizTotal)
        x2 = bMenosRaiz / (2*a)
        println("El primer valor de X com b - raiz es: $x2")
    }
}