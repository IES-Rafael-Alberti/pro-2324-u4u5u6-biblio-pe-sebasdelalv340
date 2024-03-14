package org.pebiblioteca






fun main() {
    val gestorBiblioteca = GestorBiblioteca()

    val libro1 = Libro(1, "Programar en kotlin", "Diego Cano", 2024, "Programación")
    val libro2 = Libro(2, "Programar en java", "Alfonso Diaz", 2015, "Java")
    val libro3 = Libro(3, "Volando voy", "Miguel Hernández", 2011, "Clásico")

    // Agrego los libros
    gestorBiblioteca.agregarLibro(libro1)
    gestorBiblioteca.agregarLibro(libro2)
    gestorBiblioteca.agregarLibro(libro3)

    // Registro los préstamos
    gestorBiblioteca.registrarPrestamo(libro1)
    gestorBiblioteca.registrarPrestamo(libro2)

    // Devolución de los libros
    gestorBiblioteca.devolverLibro(libro3)
    gestorBiblioteca.devolverLibro(libro2)

    // Muestra el estado del libro
    gestorBiblioteca.mostrarEstado(libro1)

    // Implemetación de un menú usuario
    val menu = MenuUsuario()

    menu.menu(gestorBiblioteca, libro1)
}