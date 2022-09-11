 class validar {


     var num1: Int = 0
     var num2: Int = 3
     var num3: Int = 12
     var ma = 0
     var me = 0

 fun datosA() {
     println("Ingrese el primer numero")
     num1 = readln().toInt()
     if (num1 == 0 || num1 < 0) {
         do {
             println("No puede ser 0 negatio,ingrse denuevo el numero")
             num1 = readln().toInt()
         } while (num1 == 0 || num1 < 0)

     }
if (num1 !=9) {
    primos()
}

 }

     fun datosB() {
         println("Ingrese el segundo numero")
         num2 = readln().toInt()
         if (num2 == 0 || num2 < 0) {
             do {
                 println("No puede ser 0 negatio,ingrse denuevo el numero")
                 num2 = readln().toInt()
             } while (num2 == 0 || num2 < 0)
         }
         if (num2 !=9) {
             primos()
         }

     }

     fun datosC() {
     println("Ingrese el tercer numero")
     num3= readln().toInt()
     if (num3==0 || num3 < 0){
         do {
             println("No puede ser 0 negatio,ingrse denuevo el numero")
             num3= readln().toInt()
         }while (num3==0 || num3 < 0)
     }

         if (num3 !=9) {
             primos()
         }

     }

     fun iguales() {
         if ( num1 == num2){
             println("El primer numero esta repetido, reingreselo")
             datosA()
         };if ( num2 == num3){
             println("El segundo numero esta repetido, reingreselo")
             datosC()
         };if ( num3 == num1){
             println("El tercer numero esta repetido, reingreselo")
             datosB()
         };if ( num3 == num2){
             println("El tercer numero esta repetido, reingreselo")
             datosC()
         }

     }

    fun primos(){
        if (num1 % 3 != 0){
            println("El primer numero no es primo,reingreselo")
            datosA()
        };if (num2 % 3 != 0){
            println("El segundo numero no es primo,reingreselo")
            datosB()
        };if (num3 % 3 != 0){
            println("El tercer numero no es primo,reingreselo")
            datosB()
        }
    }
fun mayor(){
    if (num1 > num2 && num1 > num3){
        ma=num1
    };if (num2 > num1 && num2 > num3){
        ma=num2
    };if (num3 > num1 && num3 > num2){
        ma=num3
    }

}
     fun menor(){
         if (num1 < num2 && num1 < num3){
             me=num1
         };if (num2 < num1 && num2 < num3){
             me=num2
         };if (num3 < num1 && num3 < num2){
             me=num3
         }

     }

fun calculo(){
    var mayorSumado = 0
    var menorRestado = 0
    if (ma<100){
        menorRestado = me-5
        println("$me - 5 = $menorRestado")
    }
    if (me>5){
        mayorSumado = ma +10
        println("$ma + 10 = $mayorSumado")
    }
}
 }


