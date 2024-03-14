package org.pebiblioteca

import javax.xml.catalog.Catalog


class GestorBiblioteca(var catalogo: MutableList<Libro> = mutableListOf(),
                       val utilidadesBiblioteca: UtilidadesBiblioteca
) {

    fun agregarLibro(libro: Libro) {
        libro.id = utilidadesBiblioteca.generarIdentificadorUnico()
        catalogo.add(libro)
    }

    fun eliminarLibro(libro: Libro) {
        catalogo.remove(libro)
    }

    fun registrarPrestamo(libro: Libro, registroPrestamos: RegistroPrestamos, prestamo: Prestamo) {
        if (libro.estado == TIPOESTADO.DISPONIBLE) {
            libro.estado = TIPOESTADO.PRESTADO
            registroPrestamos.registrarPrestamo(prestamo)
        }
    }

    fun devolverLibro(libro: Libro, registroPrestamos: RegistroPrestamos, prestamo: Prestamo) {
        libro.estado = TIPOESTADO.DISPONIBLE
        registroPrestamos.devolverLibro(prestamo)
    }

    fun consultarDisponibilidad(libro: Libro): Boolean {
        val libroEncontrado = catalogo.find { libro.estado == TIPOESTADO.DISPONIBLE }
        return if ( libroEncontrado != null) {
            true
        } else {
            false
        }
    }

    fun mostrarTodos() {
        catalogo.forEach { it.toString() }
    }

    fun mostrarDisponibles() {
        catalogo.filter {it.estado == TIPOESTADO.DISPONIBLE}
    }

    fun consultarHistorial(registroPrestamos: RegistroPrestamos, libro: Libro, usuario: Usuario) {
        registroPrestamos.consultarHistorialPorLibro(libro)
        registroPrestamos.consultarHistorialPorUsuario(usuario)

    }

}