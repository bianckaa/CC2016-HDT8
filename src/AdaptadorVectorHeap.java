/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Seccion 31
 * Hoja de Trabajo 8
 * Biancka Raxón 24960
 * 
 * Clase: AdaptadorVectorHeap.java
 * Clase que sirve como un adaptador para la implementación VectorHeap, 
 * haciendo que sea compatible con la interfaz IPriorityQueue.
 * 
*/

public class AdaptadorVectorHeap<E extends Comparable<E>> implements IPriorityQueue<E> {
    private VectorHeap<E> heap;

    /**
     * Constructor que inicializa la cola de prioridad adaptada utilizando un `VectorHeap`.
     */
    public AdaptadorVectorHeap() {
        heap = new VectorHeap<>();
    }

    /**
     * Agrega un valor a la cola de prioridad.
     * 
     * @param value el valor a agregar.
     */
    @Override
    public void add(E value) {
        heap.add(value);
    }

    /**
     * Elimina y retorna el elemento con la mayor prioridad de la cola.
     * 
     * @return el elemento con la mayor prioridad.
     */
    @Override
    public E remove() {
        return heap.remove();
    }

    /**
     * Retorna el elemento con la mayor prioridad sin eliminarlo.
     * 
     * @return el elemento con la mayor prioridad.
     */
    @Override
    public E peek() {
        return heap.peek();
    }

    /**
     * Verifica si la cola está vacía.
     * 
     * @return true si la cola está vacía, false en caso contrario.
     */
    @Override
    public boolean isEmpty() {
        return heap.isEmpty();
    }
}
