fun main() {
    // Creamos un mapa mutable de nombres y edades
    val edades = mutableMapOf("Juan" to 25, "Pedro" to 30, "María" to 28, "Ana" to 20, "Luisa" to 35)

    // Imprimimos el mapa de edades
    println("El mapa de edades es: $edades")

    // Obtenemos la edad de una persona en particular
    val persona = "María"
    val edad = edades[persona]
    if (edad != null) {
        println("La edad de $persona es $edad años")
    } else {
        println("No se encontró la edad de $persona en el mapa")
    }

    // Agregamos una nueva persona al mapa de edades
    val nuevaPersona = "Carlos"
    val nuevaEdad = 40
    edades.put(nuevaPersona, nuevaEdad)
    println("El mapa de edades actualizado es: $edades")

    // Recorremos el mapa de edades y lo imprimimos en orden alfabético
    println("El mapa de edades en orden alfabético es:")
    edades.toSortedMap().forEach { (nombre, edad) ->
        println("$nombre tiene $edad años")
    }
}
