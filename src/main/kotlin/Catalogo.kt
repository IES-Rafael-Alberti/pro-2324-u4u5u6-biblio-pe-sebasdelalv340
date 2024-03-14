package org.pebiblioteca

class Catalogo(var catalogoLibros: GestorElementos<Libro> = GestorElementos(),
    var catalogoRevistas: GestorElementos<Revista> = GestorElementos(),
    var catalogoDvd: GestorElementos<DVD> = GestorElementos()
) {

    fun agregarElementoBiblioteca(elementoBiblioteca: ElementoBiblioteca) {
        when (elementoBiblioteca) {
            is Libro -> catalogoLibros.agregarElementos(elementoBiblioteca)
            is Revista -> catalogoRevistas.agregarElementos(elementoBiblioteca)
            is DVD -> catalogoDvd.agregarElementos(elementoBiblioteca)
        }
    }

    fun eliminarElementoBiblioteca(elementoBiblioteca: ElementoBiblioteca) {
        when (elementoBiblioteca) {
            is Libro -> catalogoLibros.eliminarElementos(elementoBiblioteca)
            is Revista -> catalogoRevistas.eliminarElementos(elementoBiblioteca)
            is DVD -> catalogoDvd.eliminarElementos(elementoBiblioteca)
        }
    }

    fun buscarElementosBiblioteca(elementoBiblioteca: ElementoBiblioteca): ElementoBiblioteca? {
        when (elementoBiblioteca) {
            is Libro -> return catalogoLibros.buscarElemento(elementoBiblioteca)
            is Revista -> return catalogoRevistas.buscarElemento(elementoBiblioteca)
            is DVD -> return catalogoDvd.buscarElemento(elementoBiblioteca)
        }
        return null
    }
}