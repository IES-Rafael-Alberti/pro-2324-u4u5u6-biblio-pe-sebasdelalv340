package org.pebiblioteca

class GestorElementos<T> {

    private var listaElementos: MutableList<T> = mutableListOf()

    fun agregarElementos(elemento: T) {
        listaElementos.add(elemento)
    }

    fun eliminarElementos(elemento: T) {
        listaElementos.remove(elemento)
    }

    fun buscarElemento(elemento: T): T? {
        return listaElementos.find { it == elemento }
    }

}