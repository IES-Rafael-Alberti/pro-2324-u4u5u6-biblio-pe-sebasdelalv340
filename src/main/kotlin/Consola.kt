package org.pebiblioteca


/**
 * Interfaz para mostrar los datos.
 */
interface Notificador {
    fun enviar(mensaje: String) {
    }
}

/**
 * Interfaz para definir métodos de entrada de datos.
 */
interface EntradaDatos {
    fun leerEntero(): Int
}

/**
 * Objeto único que implementa las interfaces [Notificador] y [EntradaDatos] utilizando la entrada y salida estándar de la consola.
 */
object Consola: Notificador, EntradaDatos {

    /**
     * Printea el mensaje que pasamos por parámetro.
     *
     * @param mensaje El mensaje a enviar.
     */
    override fun enviar(mensaje: String) {
        print(mensaje)
    }

    /**
     * Lee un entero por consola.
     *
     * @return El entero leído.
     */
    override fun leerEntero(): Int {
        var continuar = true
        var entero = 0
        do {
            try {
                entero = readln().toInt()
                continuar = false
            } catch (e: NumberFormatException) {
                println("La entrada no es una opción válida.")
            }
        } while (continuar)
        return entero
    }
}