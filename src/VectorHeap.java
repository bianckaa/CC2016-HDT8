/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Seccion 31
 * Hoja de Trabajo 8
 * Biancka Raxón 24960
 * 
 * Clase: VectorHeap.java
 * Clase que implementa una cola con prioridad usando un heap basado en Vector. 
 * Implementa el ADT PriorityQueue definido por la interfaz IPriorityQueue.
 * 
 * Referencia:
 * https://www.udb.edu.sv/udb_files/recursos_guias/informatica-ingenieria/programacion-iv/2019/ii/guia-5.pdf
*/
import java.util.Vector;

public class VectorHeap<E extends Comparable<E>> implements IPriorityQueue<E> {
    private Vector<E> data;

    /**
     * Constructor de la clase VectorHeap. Inicializa la estructura de datos.
     */
    public VectorHeap() {
        data = new Vector<>();
    }

    /**
     * Agrega un elemento a la cola con prioridad.
     *
     * @param value el valor a agregar a la cola.
     */
    @Override
    public void add(E value) {
        data.add(value);
        percolateUp(data.size() - 1);
    }

    /**
     * Elimina el elemento con la más alta prioridad (el mínimo).
     * La raíz del heap se elimina y la última posición se coloca en la raíz,
     * luego se ajusta la estructura del heap mediante percolateDown.
     *
     * @return el elemento con la más alta prioridad, o null si la cola está vacía.
     */
    @Override
    public E remove() {
        if (data.isEmpty()) return null;
        E min = data.get(0);
        E last = data.remove(data.size() - 1);
        if (!data.isEmpty()) {
            data.set(0, last);
            percolateDown(0);
        }
        return min;
    }

    /**
     * Verifica si la cola con prioridad está vacía.
     *
     * @return true si la cola está vacía, false en caso contrario.
     */
    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * Obtiene el elemento con la más alta prioridad (el mínimo) sin eliminarlo.
     *
     * @return el elemento con la más alta prioridad, o null si la cola está vacía.
     */
    @Override
    public E peek() {
        return data.isEmpty() ? null : data.get(0);
    }

    /**
     * Mueve el elemento en la posición dada hacia arriba en el heap para
     * mantener la propiedad de heap.
     * 
     * @param index la posición del elemento a mover.
     */
    private void percolateUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (data.get(index).compareTo(data.get(parent)) < 0) {
                swap(index, parent);
                index = parent;
            } else break;
        }
    }

    /**
     * Mueve el elemento en la posición dada hacia abajo en el heap para
     * mantener la propiedad de heap.
     * 
     * @param index la posición del elemento a mover.
     */
    private void percolateDown(int index) {
        int child = 2 * index + 1;
        while (child < data.size()) {
            int min = child;
            int right = child + 1;
            if (right < data.size() && data.get(right).compareTo(data.get(child)) < 0) {
                min = right;
            }
            if (data.get(min).compareTo(data.get(index)) < 0) {
                swap(index, min);
                index = min;
                child = 2 * index + 1;
            } else break;
        }
    }

    /**
     * Intercambia los elementos en las posiciones dadas.
     * 
     * @param i el índice del primer elemento.
     * @param j el índice del segundo elemento.
     */
    private void swap(int i, int j) {
        E temp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, temp);
    }
}
