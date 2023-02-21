fun main() {
    // Creamos una lista de nombres
    val nombres = listOf("Juan", "Pedro", "María", "Ana", "Luisa")

    // Imprimimos la lista de nombres
    println("Los nombres en la lista son: $nombres")

    // Filtramos los nombres que comienzan con "M"
    val nombresConM = nombres.filter { it.startsWith("M") }
    println("Los nombres que comienzan con M son: $nombresConM")

    // Ordenamos los nombres alfabéticamente
    val nombresOrdenados = nombres.sorted()
    println("Los nombres ordenados alfabéticamente son: $nombresOrdenados")

    // Contamos cuántos nombres tienen más de 4 letras
    val cantidadNombresLargos = nombres.count { it.length > 4 }
    println("Hay $cantidadNombresLargos nombres con más de 4 letras")

    // Convertimos la lista de nombres a mayúsculas
    val nombresMayusculas = nombres.map { it.toUpperCase() }
    println("Los nombres en mayúsculas son: $nombresMayusculas")
}