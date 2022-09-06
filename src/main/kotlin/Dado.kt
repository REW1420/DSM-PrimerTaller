import java.util.*
open class Dado {
    var numero: Int = 0
    val uno : String = " Uno "
    val dos : String = " Dos "
    val tres : String = " Tres "
    val cuatro : String = " Cuatro "
    val cinco : String = " Cinco "
    val seis : String = " Seis "
    val siete : String = " Siete "
    val ocho : String = " Ocho "
    val nueve : String = " Nueve "

    val treinta : String = " Treinta y"
    val cuarenta : String = "Cuarenta y"

    open fun tirar (){
        numero = (1..50).random()
    }
    open fun imprimir (){
        println(numero)
    }
    fun traducir () {
        if (numero > 0 && numero < 9) {
            if (numero == 1) {
                println("$numero" + " = Uno")
            };if (numero == 2) {
                println("$numero" + " = Dos")
            };if (numero == 3) {
                println("$numero" + " = Tres")
            };if (numero == 4) {
                println("$numero" + " = Cuatro")
            };if (numero == 5) {
                println("$numero" + " = Cinco")
            };if (numero == 6) {
                println("$numero" + " = Seis")
            };if (numero == 7) {
                println("$numero" + " = Siete")
            };if (numero == 8) {
                println("$numero" + " = Ocho")
            };if (numero == 9) {
                println("$numero" + " = Nueve")
            }

        };if (numero >= 10 && numero < 19) {
            if (numero == 10) {
                println("$numero" + " = Diez")
            };if (numero == 11) {
                println("$numero" + " = Once")
            };if (numero == 12) {
                println("$numero" + " = Doce")
            };if (numero == 13) {
                println("$numero" + " = Trece")
            };if (numero == 14) {
                println("$numero" + " = Catorce")
            };if (numero == 15) {
                println("$numero" + " = Quince")
            };if (numero == 16) {
                println("$numero" + " = Diez y" + seis)
            };if (numero == 17) {
                println("$numero" + " = Diez y" + siete)
            };if (numero == 18) {
                println("$numero" + " = Diez y" + ocho)
            };if (numero == 19) {
                println("$numero" + " = Diez y" + nueve)
            }
        };if (numero >= 20 && numero < 29) {
            if (numero == 20) {
                println("$numero" + " = Veinte")
            };if (numero == 21) {
                println("$numero" + " = Veinte" + uno)
            };if (numero == 22) {
                println("$numero" + " = Veinte" + dos)
            };if (numero == 23) {
                println("$numero" + " = Veinte" + tres)
            };if (numero == 24) {
                println("$numero" + " = Veinte" + cuatro)
            };if (numero == 25) {
                println("$numero" + " = Veinte" + cinco)
            };if (numero == 26) {
                println("$numero" + " = Veinte" + seis)
            };if (numero == 27) {
                println("$numero" + " = Veinte" + siete)
            };if (numero == 28) {
                println("$numero" + " = Veinte" + ocho)
            };if (numero == 29) {
                println("$numero" + " = Veinte" + nueve)
            }

        };if (numero >= 30 && numero < 39) {
            if (numero == 30) {
                println("$numero" + " = " + "Treinta")
            };if (numero == 31) {
                println("$numero" + " = $treinta" + uno)
            };if (numero == 32) {
                println("$numero" + " = $treinta" + dos)
            };if (numero == 33) {
                println("$numero" + " = $treinta" + tres)
            };if (numero == 34) {
                println("$numero" + " = $treinta" + cuatro)
            };if (numero == 35) {
                println("$numero" + " = $treinta" + cinco)
            };if (numero == 36) {
                println("$numero" + " = $treinta" + seis)
            };if (numero == 37) {
                println("$numero" + " = $treinta" + siete)
            };if (numero == 38) {
                println("$numero" + " = $treinta" + ocho)
            };if (numero == 39) {
                println("$numero" + " = $treinta" + nueve)
            }
        };if (numero >= 40 && numero < 49) {
            if (numero == 40) {
                println("$numero" + " = " + "Cuarenta")
            };if (numero == 41) {
                println("$numero" + " = $cuarenta" + uno)
            };if (numero == 42) {
                println("$numero" + " = $cuarenta" + dos)
            };if (numero == 43) {
                println("$numero" + " = $cuarenta" + tres)
            };if (numero == 44) {
                println("$numero" + " = $cuarenta" + cuatro)
            };if (numero == 45) {
                println("$numero" + " = $cuarenta" + cinco)
            };if (numero == 46) {
                println("$numero" + " = $cuarenta" + seis)
            };if (numero == 47) {
                println("$numero" + " = $cuarenta" + siete)
            };if (numero == 48) {
                println("$numero" + " = $cuarenta" + ocho)
            };if (numero == 49) {
                println("$numero" + " = $cuarenta" + nueve)
            }
        }
    }
}