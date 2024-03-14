package org.pebiblioteca

class RegistroPrestamos(private var registroPrestamosActuales: MutableList<Prestamo> = mutableListOf(),
                        private var historialPrestamos: MutableList<Prestamo> = mutableListOf()
): IGestorPrestamos {


    override fun registrarPrestamo(prestamo: Prestamo) {
        registroPrestamosActuales.add(prestamo)
        historialPrestamos.add(prestamo)
    }

    override fun devolverLibro(prestamo: Prestamo) {
        registroPrestamosActuales.remove(prestamo)
    }

    override fun consultarHistorialPorElemento(elemento: ElementoBiblioteca) {
        historialPrestamos.filter { it.elementoBiblioteca == elemento}
    }

    override fun consultarHistorialPorUsuario(usuarioConsulta: Usuario) {
        historialPrestamos.filter { it.usuario == usuarioConsulta }
    }
}