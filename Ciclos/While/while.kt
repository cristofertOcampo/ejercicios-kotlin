//? Haga un algoritmo que solicite n cantidad de números hasta que el usuario ingrese el número 5

fun main(){

    var numero = 0

    while(numero != 5){
        println("ingrese un numero")
        numero = readLine()!!.toInt()
    }
    println("Ha ingresado el Numero $numero")

}
