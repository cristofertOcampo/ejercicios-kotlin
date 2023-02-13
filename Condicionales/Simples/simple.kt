//? Haga un algoritmo que solicite el ingreso de un número positivo, 
//? en caso de ser negativo imprima un mensaje indicando que no es positivo.

fun main() {
    
    println("Ingrese un numero positivo:")
    var num = readLine()!!.toInt()

    if(num < 0 ){
        println("El numero no es positivo")
    }

    println("El numero es : $num")

}