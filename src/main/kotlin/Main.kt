package org.pebiblioteca




fun main() {

    val libro = Libro(0, "Programar en kotlin", "Diego Cano",2024, "Progamación")
    val revista = Revista(0, "Rolling Stone", TIPOESTADO.DISPONIBLE)
    val dvd = DVD(0, "La roca", TIPOESTADO.PRESTADO, "Michael Bay")



    val usuario1 = Usuario(0, "Sebas")
    val usuario2 = Usuario(0, "Alberto")
    val usuario3 = Usuario(0, "Rosa")
    val usuario4 = Usuario(0, "Teresa")

    val prestamo = Prestamo(dvd, usuario2)

    val utilidadesBiblioteca = UtilidadesBiblioteca()
    val registroPrestamos = RegistroPrestamos()
    val catalogo = Catalogo()
    val gestorBiblioteca = GestorBiblioteca(catalogo, utilidadesBiblioteca)

    // Operación de préstamo
    gestorBiblioteca.registrarPrestamo(registroPrestamos, prestamo)

    // Operación de devolución
    gestorBiblioteca.devolverLibro(registroPrestamos, prestamo)


}