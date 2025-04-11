/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Seccion 31
 * Hoja de Trabajo 8
 * Biancka Raxón 24960
 * 
 * Clase: IPriorityQueue.java
 * Interfaz que define las operaciones básicas para una cola de prioridad.
 * 
*/

public interface IPriorityQueue<E extends Comparable<E>> {
    /**
     * Agrega un valor a la cola de prioridad.
     * 
     * @param value el valor a agregar.
     */
    void add(E value);
    
    /**
     * Elimina y retorna el elemento con la mayor prioridad de la cola.
     * 
     * @return el elemento con la mayor prioridad.
     */
    E remove();

    /**
     * Verifica si la cola está vacía.
     * 
     * @return true si la cola está vacía, false en caso contrario.
     */
    boolean isEmpty();

    /**
     * Retorna el elemento con la mayor prioridad sin eliminarlo.
     * 
     * @return el elemento con la mayor prioridad.
     */
    E peek();
}
