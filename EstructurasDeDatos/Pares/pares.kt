fun main() {
    // Creamos un par de valores
    val par = Pair("Hola", 123)

    // Imprimimos los valores del par
    println("El par es: $par")
    println("El primer valor del par es: ${par.first}")
    println("El segundo valor del par es: ${par.second}")

    // Creamos una lista de pares
    val listaPares = listOf(
        Pair("Juan", 25),
        Pair("Pedro", 30),
        Pair("María", 28),
        Pair("Ana", 20),
        Pair("Luisa", 35)
    )

    // Imprimimos la lista de pares
    println("La lista de pares es: $listaPares")

    // Filtramos los pares que tienen una edad mayor a 25 años
    val paresMayores25 = listaPares.filter { it.second > 25 }
    println("Los pares con edad mayor a 25 son: $paresMayores25")

    // Ordenamos los pares alfabéticamente por nombre
    val paresOrdenados = listaPares.sortedBy { it.first }
    println("Los pares ordenados alfabéticamente son: $paresOrdenados")
}
