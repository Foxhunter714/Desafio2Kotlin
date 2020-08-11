package com.example.myapplication2

data class LibroEscolar(val nombre: String, var isbn: String, val anio: Int, var editorial: String, val cant: Int, var precio: Int, val autor: String, val tipo: Boolean)

fun LibroEscolar.digital(): String {
    if (this.tipo == true) return "Digital"
    return "Impreso"
}

fun LibroEscolar.precioFormateado(): String{
    return "$$precio"
}

fun LibroEscolar.imprimir(){
    println("Los datos del libro son: ${this.nombre} - ${this.isbn} - ${this.anio} - ${this.editorial} - ${this.cant} - ${this.precioFormateado()} - ${this.autor} - ${this.digital()}" )
}
fun main(){
    var libro = LibroEscolar("Papelucho", "123BN", 1976, "Alfaguara", 3, 10000, "Marcela Paz", false)
    var libro1 = LibroEscolar("Papelucho de vacaciones", "124BN", 1980, "Alfaguara", 2, 15000, "Marcela Paz", false)
    var libro2 = LibroEscolar("Papelucho y el marciano", "125BN", 1985, "Alfaguara", 2, 1200, "Marcela Paz", true)
    val libro3 = LibroEscolar("Papelucho y mi hermana Gil", "126BN", 1990, "El Bosque", 1, 1100, "Marcela Paz", true)
    //println("Los datos del libro 1 son: ${libro.nombre} - ${libro.isbn} - ${libro.anio} - ${libro.editorial} - ${libro.cant} - ${libro.precioFormateado()} - ${libro.autor} - ${libro.digital()}" )
    //println("Los datos del libro 2 son: ${libro1.nombre} - ${libro1.isbn} - ${libro1.anio} - ${libro1.editorial} - ${libro1.cant} - ${libro1.precioFormateado()} - ${libro1.autor} - ${libro1.digital()}" )
    //println("Los datos del libro 3 son: ${libro2.nombre} - ${libro2.isbn} - ${libro2.anio} - ${libro2.editorial} - ${libro2.cant} - ${libro2.precioFormateado()} - ${libro2.autor} - ${libro2.digital()}" )
    //println("Los datos del libro 4 son: ${libro3.nombre} - ${libro3.isbn} - ${libro3.anio} - ${libro3.editorial} - ${libro3.cant} - ${libro3.precioFormateado()} - ${libro3.autor} - ${libro3.digital()}" )
    libro.imprimir()
    libro1.imprimir()
    libro2.imprimir()
    libro3.imprimir()
}

