import java.util.Vector;

/**
 * Implementación de una PriorityQueue utilizando un heap basado en Vector
 */
public class VectorHeap<E extends Comparable<E>> implements IPriorityQueue<E> {
    private Vector<E> data;

    public VectorHeap() {
        data = new Vector<>();
    }

    @Override
    public void add(E value) {
        data.add(value);
        percolateUp(data.size() - 1);
    }

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

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public E peek() {
        return data.isEmpty() ? null : data.get(0);
    }

    private void percolateUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (data.get(index).compareTo(data.get(parent)) < 0) {
                swap(index, parent);
                index = parent;
            } else break;
        }
    }

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

    private void swap(int i, int j) {
        E temp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, temp);
    }
}
