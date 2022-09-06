import kotlin.math.pow
import kotlin.math.sqrt

open class CapturaDeDatos:numero() {

   open fun CapturarDatoA(){
        println("Ingrese el valor de A: ")
        a= readln().toDouble()

    }

    open fun CapturarDatoB(){
        println("Ingrese el valor de B: ")
        b= readln().toDouble()

    }

    open fun CapturarDatoC(){
        println("Ingrese el valor de C: ")
        c = readln().toDouble()

    }

    var bPotencia = 0.0
    var ac = 0.0
    var total = 0.0
    var raizTotal = 0.0
    var bMasRaiz = 0.0
    var x1 = 0.0
    var x2 = 0.0

    open fun primeraRaiz(){
        println(a)
        println(b)
        println(c)


        bPotencia = b.pow(2.0)
        ac = (4 * a * c)

        total = (bPotencia - ac)

        raizTotal = sqrt(total)

        println(raizTotal)

    }fun primerRaultado(){
        bMasRaiz = (-b)+raizTotal
        x1 = bMasRaiz / (2*a)
        println("El primer valor de X com b + raiz es: $x1")

    }fun segundoRaultado(){
        bMasRaiz = (-b)-raizTotal
        x2 = bMasRaiz / (2*a)
        println("El primer valor de X com b + raiz es: $x2")
    }
}