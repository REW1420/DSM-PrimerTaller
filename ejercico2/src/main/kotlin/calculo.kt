


class calculo(){

    var sueldo : Float = 0F
    var Nombre  : String =""
    val ISS = 0.03
    val AFP = 0.04
    val RENTA = 0.05
    var ingreseDatos:  String =""
    var Deducciones : String =""

    fun ingreseDatos() {
        print("ingrese nombre")
        Nombre = readln().toString()
        print("ingrese salario base")
        sueldo = readln().toFloat()
    }

        fun Deducciones() {


            var calIss = (sueldo * ISS)
            var calAfp = (sueldo * AFP)
            var calRenta = (sueldo * RENTA)

            var subNeto = (calIss + calAfp + calRenta)
            var SalarioNeto = (sueldo - subNeto)
            println("$Nombre \n Sueldo base  $sueldo \n  calculo de ISS $calIss \n calculo de AFP $calAfp \n descuento total $subNeto \n salario Neto $SalarioNeto")
        }
    }
