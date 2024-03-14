package org.pebiblioteca

class RegistroPrestamos(private var registroPrestamosActuales: MutableList<Prestamo> = mutableListOf(),
                        private var historialPrestamos: MutableList<Prestamo> = mutableListOf()
) {


    fun registrarPrestamo(prestamo: Prestamo) {
        registroPrestamosActuales.add(prestamo)
        historialPrestamos.add(prestamo)
    }

    fun devolverLibro(prestamo: Prestamo) {
        registroPrestamosActuales.remove(prestamo)
    }

    fun consultarHistorialPorLibro(libroConsulta: Libro) {
        historialPrestamos.filter { it.libro == libroConsulta}
    }

    fun consultarHistorialPorUsuario(usuarioConsulta: Usuario) {
        historialPrestamos.filter { it.usuario == usuarioConsulta }
    }
}