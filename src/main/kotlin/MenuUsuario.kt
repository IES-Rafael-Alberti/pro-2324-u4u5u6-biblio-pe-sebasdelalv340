package org.pebiblioteca

class MenuUsuario {

    fun menu(gestorBiblioteca: GestorBiblioteca, libro: Libro) {

        var opcion: Int

        do {
            Consola.enviar("* Menu *\n")
            Consola.enviar("1. Agregar libro.\n")
            Consola.enviar("2. Eliminar libro.\n")
            Consola.enviar("3. Registrar préstamo.\n")
            Consola.enviar("4. Registrar devolución.\n")
            Consola.enviar("5. Mostrar estado.\n")
            Consola.enviar("6. Salir\n")
            Consola.enviar("Elige una ópción: ")
            opcion = Consola.leerEntero()

            when (opcion) {
                1 -> gestorBiblioteca.agregarLibro(libro)
                2 -> gestorBiblioteca.eliminarLibro(libro)
                3 -> gestorBiblioteca.registrarPrestamo(libro)
                4 -> gestorBiblioteca.devolverLibro(libro)
                5 -> gestorBiblioteca.mostrarTodos()
                6 -> Consola.enviar("Hasta luego")
                else -> Consola.enviar("Opción no válida")
            }
        } while (opcion != 6)
    }

}