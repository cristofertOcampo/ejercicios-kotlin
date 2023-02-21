fun main() {
    // Creamos dos conjuntos de números
    val conjuntoA = setOf(1, 2, 3, 4, 5)
    val conjuntoB = setOf(3, 4, 5, 6, 7)

    // Imprimimos los conjuntos
    println("El conjunto A es: $conjuntoA")
    println("El conjunto B es: $conjuntoB")

    // Unimos los dos conjuntos en un nuevo conjunto
    val conjuntoUnion = conjuntoA.union(conjuntoB)
    println("La unión de los conjuntos es: $conjuntoUnion")

    // Obtenemos la intersección de los dos conjuntos
    val conjuntoInterseccion = conjuntoA.intersect(conjuntoB)
    println("La intersección de los conjuntos es: $conjuntoInterseccion")

    // Obtenemos la diferencia entre el conjunto A y el conjunto B
    val conjuntoDiferencia = conjuntoA.subtract(conjuntoB)
    println("La diferencia entre el conjunto A y el conjunto B es: $conjuntoDiferencia")

    // Verificamos si un elemento está en el conjunto A
    val elemento = 3
    if (elemento in conjuntoA) {
        println("El elemento $elemento está en el conjunto A")
    } else {
        println("El elemento $elemento no está en el conjunto A")
    }
}
