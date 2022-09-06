import kotlin.math.pow
import kotlin.math.sqrt

class Operaciones: numero() {

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