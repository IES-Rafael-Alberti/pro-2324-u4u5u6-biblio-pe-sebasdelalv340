package org.pebiblioteca

abstract class ElementoBiblioteca(id: Int,
                                  val titulo: String,
                                  var estado: TIPOESTADO
) {
    var id = generarId()

    companion object {
        private var idGenerado: Int = 0

        fun generarId(): Int {
            idGenerado++
            return idGenerado
        }
    }

    override fun toString(): String {
        return "Id: $id, título: $titulo y estado: $estado"
    }
}