fun main() {
    // Creamos un arreglo de números enteros
    val numeros = intArrayOf(5, 10, 15, 20, 25)

    // Imprimimos los valores del arreglo
    println("Los valores del arreglo son: ${numeros.contentToString()}")

    // Obtenemos la suma de todos los elementos del arreglo
    var suma = 0
    for (numero in numeros) {
        suma += numero
    }
    println("La suma de los elementos del arreglo es: $suma")

    // Obtenemos el promedio de los elementos del arreglo
    val promedio = suma / numeros.size.toDouble()
    println("El promedio de los elementos del arreglo es: $promedio")

    // Buscamos el elemento mayor y menor del arreglo
    var mayor = numeros[0]
    var menor = numeros[0]
    for (numero in numeros) {
        if (numero > mayor) {
            mayor = numero
        }
        if (numero < menor) {
            menor = numero
        }
    }
    println("El elemento mayor del arreglo es: $mayor")
    println("El elemento menor del arreglo es: $menor")
}
