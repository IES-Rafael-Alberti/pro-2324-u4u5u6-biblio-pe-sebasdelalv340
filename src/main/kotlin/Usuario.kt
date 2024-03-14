package org.pebiblioteca

class Usuario(id: Int,
              private val nombre: String
) {

    var id = generarId()
    var librosPrestados: MutableList<Libro> = mutableListOf()

    init {
        require(nombre.isNotEmpty()) {"El nombre no puede estar vacío"}
    }
    companion object {
        var idGenerado: Int = 0

        fun generarId(): Int {
            idGenerado++
            return idGenerado
        }
    }

    fun agregarLibro(libro: Libro) {
        librosPrestados.add(libro)
    }

    fun quitarLibro(libro: Libro) {
        librosPrestados.remove(libro)
    }

    fun consultarLibrosPrestados(libro: Libro): Libro? {
        return librosPrestados.find { it == libro }
    }

    override fun toString(): String {
        return "Id: $id, usuario: $nombre."
    }
}