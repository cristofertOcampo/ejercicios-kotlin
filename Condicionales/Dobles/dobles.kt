//? Haga algoritmo que solicite la edad de una persona, si la edad es menor a 18 
//? indique es la persona es menor de edad, de lo contrario indique que es mayor de edad

fun main() {
    
    println("Ingrese una edad")

    var age = readLine()!!.toInt()

    if(age < 18){
        println("La persona es menor de edad")
    }else{
        println("La persona es mayor de edad")
    }

    println("La edad es: $age")

}