/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Seccion 31
 * Hoja de Trabajo 8
 * Biancka Raxón 24960
 * 
 * Clase: AdaptadorMyPriorityQueue.java
 * Clase adaptadora que implementa la interfaz IPriorityQueue utilizando una instancia de MyPriorityQueue.
 * 
*/
public class AdaptadorMyPriorityQueue<E extends Comparable<E>> implements IPriorityQueue<E> {
    private IPriorityQueue<E> queue;

    /**
     * Constructor que inicializa la cola de prioridad adaptada.
     */
    public AdaptadorMyPriorityQueue() {
        queue = new MyPriorityQueue<>();
    }

    /**
     * Agrega un valor a la cola de prioridad.
     * 
     * @param value el valor a agregar.
     */
    @Override
    public void add(E value) {
        queue.add(value);
    }

    /**
     * Elimina y retorna el elemento con la mayor prioridad de la cola.
     * 
     * @return el elemento con la mayor prioridad.
     */
    @Override
    public E remove() {
        return queue.remove();
    }

    /**
     * Retorna el elemento con la mayor prioridad sin eliminarlo.
     * 
     * @return el elemento con la mayor prioridad.
     */
    @Override
    public E peek() {
        return queue.peek();
    }

    /**
     * Verifica si la cola está vacía.
     * 
     * @return true si la cola está vacía, false en caso contrario.
     */
    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
