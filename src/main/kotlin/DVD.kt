package org.pebiblioteca

class DVD(id: Int,
          titulo: String,
          estado: TIPOESTADO,
          val director: String
): Prestable, ElementoBiblioteca(id, titulo, estado) {
    override fun prestar() {
        TODO("Not yet implemented")
    }

    override fun devolver() {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return "Id: $id, título: $titulo, director: $director y estado: $estado."
    }
}
