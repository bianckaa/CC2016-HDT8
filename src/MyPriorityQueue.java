/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Seccion 31
 * Hoja de Trabajo 8
 * Biancka Raxón 24960
 * 
 * Clase: MyPriorityQueue.java
 * Clase que usa PriorityQueue del Java Collection Framework para gestionar la cola de prioridad.
 * 
*/
import java.util.PriorityQueue;

public class MyPriorityQueue<E extends Comparable<E>> implements IPriorityQueue<E> {
    private PriorityQueue<E> internalQueue;

    /**
     * Constructor que inicializa la cola de prioridad utilizando la implementación de `PriorityQueue` de Java.
     */
    public MyPriorityQueue() {
        internalQueue = new PriorityQueue<>();
    }

    /**
     * Agrega un valor a la cola de prioridad.
     * 
     * @param value el valor a agregar.
     */
    @Override
    public void add(E value) {
        internalQueue.add(value);
    }

    /**
     * Elimina y retorna el elemento con la mayor prioridad de la cola.
     * 
     * @return el elemento con la mayor prioridad.
     */
    @Override
    public E remove() {
        return internalQueue.poll();
    }

    /**
     * Retorna el elemento con la mayor prioridad sin eliminarlo.
     * 
     * @return el elemento con la mayor prioridad.
     */
    @Override
    public E peek() {
        return internalQueue.peek();
    }

    /**
     * Verifica si la cola está vacía.
     * 
     * @return true si la cola está vacía, false en caso contrario.
     */
    @Override
    public boolean isEmpty() {
        return internalQueue.isEmpty();
    }
}
