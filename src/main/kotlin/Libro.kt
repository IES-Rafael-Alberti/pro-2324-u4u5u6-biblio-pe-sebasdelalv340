package org.pebiblioteca

enum class TIPOESTADO {
    PRESTADO, DISPONIBLE
}

/**
 * data class Libro
 * @property id Id del libro
 * @property titulo Título del libro
 * @property autor Autor del libro
 * @property anioPublicacion Año de publicación del libro
 * @property tematica Temática del libro
 * @property estado Estado del libro
 */
class Libro(
    id: Int,
    titulo: String,
    val autor: String,
    val anioPublicacion: Int,
    val tematica: String,
    estado: TIPOESTADO = TIPOESTADO.DISPONIBLE

): Prestable, ElementoBiblioteca(id, titulo, estado) {

    init {
        require(id in 0..100) {"El id no puede estar vacío"}
        require(titulo.isNotEmpty()) {"El título no puede estar vacío."}
        require(autor.isNotEmpty()) {"El autor no puede estar vacío"}
        require(anioPublicacion in 1..2024) {"El año de publicación debe ser entre 2001 y 2024"}
    }

    override fun prestar() {}

    override fun devolver() {}

    override fun toString(): String {
        return "Id: $id, título: $titulo, autor: $autor, año de publicación: $anioPublicacion, temática: $tematica y estado: $estado."
    }

}
