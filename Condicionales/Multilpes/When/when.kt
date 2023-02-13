//? Basado en el siguiente menú
//? 1. Saludar
//? 2. Pedir Nombre de una Persona
//? 3. Sumar 2 Números
//? Haga un algoritmo que dependiendo del código ingresado, realice la acción correspondiente.


fun main(){
    
    val menu = """
    Menu de opciones 

    1) Saludar
    2) pedir nombre de una Persona
    3) Sumar 2 Números
    """
    println(menu)

    var opciones  = readLine()?.toInt()

    when(opciones){
        1 -> println("Hola")
        2 -> {
            println("Ingrese el nombre de una persona")
            var name = readLine()
            println("Hola, $name")
        }
        3 ->{
            println("Ingrese el primer numero")
            var num1 = readLine()!!.toInt()
            println("Ingrese el segundo numero")
            var num2 = readLine()!!.toInt()

            var total:Int? = (num1 + num2)

            println("La suma de $num1 y $num2 es de $total")
        }
        else -> println("Opcion invalida")
    }

}
