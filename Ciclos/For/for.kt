//? Haga un algoritmo el cual pueda ingresar un numero y dar la tabla de multiplicar del mismo

fun main(){

    println("ingrese el numero de la tabla de multiplicar")
    var numero = readLine()!!.toInt()

    for(i in 1..10){
        val resultado = i * numero
        println("$numero X $i = $resultado")
    }

}