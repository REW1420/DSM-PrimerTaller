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
    val cuarenta : String = " Cuarenta y"
    val cincuenta : String =" Cincuenta y"
    val sesenta : String =" Sesenta y"
    val setenta : String =" Sesenta y"
    val ochenta : String = " Ochenta y"
    val noventa : String = " Noventa y"

    open fun tirar (){
        numero = (1..100).random()
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
        };if (numero >= 50 && numero < 59) {
            if (numero == 50) {
                println("$numero" + " = " + "Cincuenta")
            };if (numero == 51) {
                println("$numero" + " = $cincuenta" + uno)
            };if (numero == 52) {
                println("$numero" + " = $cincuenta" + dos)
            };if (numero == 53) {
                println("$numero" + " = $cincuenta" + tres)
            };if (numero == 54) {
                println("$numero" + " = $cincuenta" + cuatro)
            };if (numero == 55) {
                println("$numero" + " = $cincuenta" + cinco)
            };if (numero == 56) {
                println("$numero" + " = $cincuenta" + seis)
            };if (numero == 57) {
                println("$numero" + " = $cincuenta" + siete)
            };if (numero == 58) {
                println("$numero" + " = $cincuenta" + ocho)
            };if (numero == 59) {
                println("$numero" + " = $cincuenta" + nueve)
            }
        };if (numero >= 60 && numero < 69) {
            if (numero == 60) {
                println("$numero" + " = " + "Sesenta")
            };if (numero == 61) {
                println("$numero" + " = $sesenta" + uno)
            };if (numero == 62) {
                println("$numero" + " = $sesenta" + dos)
            };if (numero == 63) {
                println("$numero" + " = $sesenta" + tres)
            };if (numero == 64) {
                println("$numero" + " = $sesenta" + cuatro)
            };if (numero == 65) {
                println("$numero" + " = $sesenta" + cinco)
            };if (numero == 66) {
                println("$numero" + " = $sesenta" + seis)
            };if (numero == 67) {
                println("$numero" + " = $sesenta" + siete)
            };if (numero == 68) {
                println("$numero" + " = $sesenta" + ocho)
            };if (numero == 69) {
                println("$numero" + " = $sesenta" + nueve)
            }
        };if (numero >= 70 && numero < 79) {
            if (numero == 70) {
                println("$numero" + " = " + "Sesenta")
            };if (numero == 71) {
                println("$numero" + " = $setenta" + uno)
            };if (numero == 72) {
                println("$numero" + " = $setenta" + dos)
            };if (numero == 73) {
                println("$numero" + " = $setenta" + tres)
            };if (numero == 74) {
                println("$numero" + " = $setenta" + cuatro)
            };if (numero == 75) {
                println("$numero" + " = $setenta" + cinco)
            };if (numero == 76) {
                println("$numero" + " = $setenta" + seis)
            };if (numero == 77) {
                println("$numero" + " = $setenta" + siete)
            };if (numero == 78) {
                println("$numero" + " = $setenta" + ocho)
            };if (numero == 79) {
                println("$numero" + " = $setenta" + nueve)
            }
        };if (numero >= 80 && numero < 89) {
            if (numero == 80) {
                println("$numero" + " = " + " Ochenta")
            };if (numero == 81) {
                println("$numero" + " = $ochenta" + uno)
            };if (numero == 82) {
                println("$numero" + " = $ochenta" + dos)
            };if (numero == 83) {
                println("$numero" + " = $ochenta" + tres)
            };if (numero == 84) {
                println("$numero" + " = $ochenta" + cuatro)
            };if (numero == 85) {
                println("$numero" + " = $ochenta" + cinco)
            };if (numero == 86) {
                println("$numero" + " = $ochenta" + seis)
            };if (numero == 87) {
                println("$numero" + " = $ochenta" + siete)
            };if (numero == 88) {
                println("$numero" + " = $ochenta" + ocho)
            };if (numero == 89) {
                println("$numero" + " = $ochenta" + nueve)
            }
        };if (numero >= 90 && numero <= 100) {
            if (numero == 90) {
                println("$numero" + " = " + " Ochenta")
            };if (numero == 91) {
                println("$numero" + " = $noventa" + uno)
            };if (numero == 92) {
                println("$numero" + " = $noventa" + dos)
            };if (numero == 93) {
                println("$numero" + " = $noventa" + tres)
            };if (numero == 94) {
                println("$numero" + " = $noventa" + cuatro)
            };if (numero == 95) {
                println("$numero" + " = $noventa" + cinco)
            };if (numero == 96) {
                println("$numero" + " = $noventa" + seis)
            };if (numero == 97) {
                println("$numero" + " = $noventa" + siete)
            };if (numero == 98) {
                println("$numero" + " = $noventa" + ocho)
            };if (numero == 99) {
                println("$numero" + " = $noventa" + nueve)
            };if (numero == 100){
                println("$numero" + " = Cien")
            }
        }
    }
}