package org.pebiblioteca

class Catalogo(var catalogoElementosBiblioteca: MutableList<ElementoBiblioteca> = mutableListOf()) {

    fun agregarLibro(elementoBiblioteca: ElementoBiblioteca) {
        catalogoElementosBiblioteca.add(elementoBiblioteca)
    }

    fun eliminarLibro(elementoBiblioteca: ElementoBiblioteca) {
        catalogoElementosBiblioteca.remove(elementoBiblioteca)
    }
}