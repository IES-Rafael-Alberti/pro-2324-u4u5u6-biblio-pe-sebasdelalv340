package org.pebiblioteca

import javax.xml.catalog.Catalog

class GestorBiblioteca(var catalogo: MutableList<Libro> = mutableListOf(),
                       var registroPrestamos: MutableList<String> = mutableListOf()
) {

    fun agregarLibro(libro: Libro) {
        catalogo.add(libro)
    }

    fun eliminarLibro(libro: Libro) {
        catalogo.remove(libro)
    }

    fun registrarPrestamo(libro: Libro) {
        if (libro.estado == TIPOESTADO.DISPONIBLE) {
            libro.estado = TIPOESTADO.PRESTADO
        }
    }

    fun devolverLibro(libro: Libro) {
        libro.estado = TIPOESTADO.DISPONIBLE
    }

    fun consultarDisponibilidad(libro: Libro): Boolean {
        val libroEncontrado = catalogo.find { libro.estado == TIPOESTADO.DISPONIBLE }
        return if ( libroEncontrado != null) {
            true
        } else {
            false
        }
    }

    fun mostrarEstado(libro: Libro) {
        if (consultarDisponibilidad(libro)) {
            Consola.enviar(libro.toString())
        }
    }

}