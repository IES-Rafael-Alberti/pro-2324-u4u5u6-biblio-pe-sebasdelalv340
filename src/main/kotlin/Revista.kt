package org.pebiblioteca

class Revista(id: Int,
    titulo: String,
    estado: TIPOESTADO): Prestable, ElementoBiblioteca(id, titulo, estado) {
    override fun prestar() {
        TODO("Not yet implemented")
    }

    override fun devolver() {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return "Id: $id, título: $titulo y estado: $estado."
    }
}