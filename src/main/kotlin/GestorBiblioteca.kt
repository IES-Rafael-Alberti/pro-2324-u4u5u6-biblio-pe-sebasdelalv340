package org.pebiblioteca

import javax.xml.catalog.Catalog


class GestorBiblioteca(var catalogo: Catalogo,
                       val utilidadesBiblioteca: UtilidadesBiblioteca,
) {

    fun agregarLibro(elemento: ElementoBiblioteca) {
        elemento.id = utilidadesBiblioteca.generarIdentificadorUnico()
        catalogo.agregarLibro(elemento)
    }

    fun eliminarLibro(elemento: ElementoBiblioteca) {
        catalogo.eliminarLibro(elemento)
    }

    fun registrarPrestamo(gestorPrestamos: IGestorPrestamos, prestamo: Prestamo) {
        if (prestamo.elementoBiblioteca.estado == TIPOESTADO.DISPONIBLE) {
            prestamo.elementoBiblioteca.estado = TIPOESTADO.PRESTADO
            gestorPrestamos.registrarPrestamo(prestamo)
        }
    }

    fun devolverLibro(gestorPrestamos: IGestorPrestamos, prestamo: Prestamo) {
        prestamo.elementoBiblioteca.estado = TIPOESTADO.DISPONIBLE
        gestorPrestamos.devolverLibro(prestamo)
    }

    fun consultarDisponibilidad(libro: Libro): Boolean {
        val libroEncontrado = catalogo.catalogoElementosBiblioteca.find { libro.estado == TIPOESTADO.DISPONIBLE }
        return if ( libroEncontrado != null) {
            true
        } else {
            false
        }
    }

    fun mostrarTodos() {
        catalogo.catalogoElementosBiblioteca.forEach { it.toString() }
    }

    fun mostrarDisponibles() {
        catalogo.catalogoElementosBiblioteca.filter {it.estado == TIPOESTADO.DISPONIBLE}
    }

    fun consultarHistorial(registroPrestamos: RegistroPrestamos, elemento: ElementoBiblioteca, usuario: Usuario) {
        registroPrestamos.consultarHistorialPorElemento(elemento)
        registroPrestamos.consultarHistorialPorUsuario(usuario)

    }

}