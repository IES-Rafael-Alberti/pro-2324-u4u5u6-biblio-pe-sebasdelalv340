package org.pebiblioteca

import javax.xml.catalog.Catalog


class GestorBiblioteca(var catalogo: Catalogo,
                       val utilidadesBiblioteca: UtilidadesBiblioteca,
) {

    fun agregarLibro(elemento: ElementoBiblioteca) {
        elemento.id = utilidadesBiblioteca.generarIdentificadorUnico()
        catalogo.agregarElementoBiblioteca(elemento)
    }

    fun eliminarLibro(elemento: ElementoBiblioteca) {
        catalogo.eliminarElementoBiblioteca(elemento)
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

    fun consultarDisponibilidad(elemento: ElementoBiblioteca): Boolean {
        val elementoConsulta = catalogo.buscarElementosBiblioteca(elemento)
        return if (elementoConsulta?.estado == TIPOESTADO.DISPONIBLE) {
            true
        } else {
            false
        }
    }

    fun mostrarTodos() {
        catalogo.catalogoElementosBiblioteca.forEach { it.toString() }
    }

    fun mostrarDisponibles() {

    }

    fun consultarHistorial(registroPrestamos: RegistroPrestamos, elemento: ElementoBiblioteca, usuario: Usuario) {
        registroPrestamos.consultarHistorialPorElemento(elemento)
        registroPrestamos.consultarHistorialPorUsuario(usuario)

    }

}