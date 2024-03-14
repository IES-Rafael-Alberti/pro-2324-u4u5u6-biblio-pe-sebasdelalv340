package org.pebiblioteca




fun main() {

    val libro1 = Libro(0, "Programar en kotlin", "Diego Cano", 2024, "Programación")
    val libro2 = Libro(0, "Programar en java", "Alfonso Diaz", 2015, "Java")
    val libro3 = Libro(0, "Volando voy", "Miguel Hernández", 2011, "Clásico")
    var listaLibros = mutableListOf(libro1, libro2, libro3)

    val usuario1 = Usuario(0, "Sebas")
    val usuario2 = Usuario(0, "Alberto")
    val usuario3 = Usuario(0, "Rosa")
    val usuario4 = Usuario(0, "Teresa")

    val prestamo = Prestamo(libro1, usuario1)

    val utilidadesBiblioteca = UtilidadesBiblioteca()
    val registroPrestamos = RegistroPrestamos()
    val gestorBiblioteca = GestorBiblioteca(listaLibros, utilidadesBiblioteca)

    // Operaciones de préstamo y devolución
    gestorBiblioteca.registrarPrestamo(libro1, registroPrestamos, prestamo)
    gestorBiblioteca.devolverLibro(libro2, registroPrestamos, prestamo)

    // Consultar historial
    gestorBiblioteca.consultarHistorial(registroPrestamos, libro1, usuario1)

    // Consulta de los datos de libro y usuario a través de métodos públicos
    libro2.toString()
    usuario3.toString()
}