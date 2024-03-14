package org.pebiblioteca

/**
 * Contiene los estados de los libros
 */
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
data class Libro(val id: Int,
                 val titulo: String,
                 val autor: String,
                 val anioPublicacion: Int,
                 val tematica: String,
                 var estado: TIPOESTADO = TIPOESTADO.DISPONIBLE) {

    init {
        require(id in 0..100) {"El id no puede estar vacío"}
        require(titulo.isNotEmpty()) {"El título no puede estar vacío."}
        require(autor.isNotEmpty()) {"El autor no puede estar vacío"}
        require(anioPublicacion in 1..2024) {"El año de publicación debe ser entre 2001 y 2024"}
    }
}
