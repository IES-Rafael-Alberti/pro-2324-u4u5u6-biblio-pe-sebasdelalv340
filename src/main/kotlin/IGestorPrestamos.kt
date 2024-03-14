package org.pebiblioteca

interface IGestorPrestamos {
    fun registrarPrestamo(prestamo: Prestamo)
    fun devolverLibro(prestamo: Prestamo)
    fun consultarHistorialPorElemento(elementoBiblioteca: ElementoBiblioteca)
    fun consultarHistorialPorUsuario(usuario: Usuario)

}