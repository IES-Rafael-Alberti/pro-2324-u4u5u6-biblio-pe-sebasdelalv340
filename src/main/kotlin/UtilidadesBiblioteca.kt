package org.pebiblioteca

class UtilidadesBiblioteca {

    companion object {
        var id = 1
    }

    fun generarIdentificadorUnico(): Int {
        val identificador = id
        id++
        return identificador
    }
}