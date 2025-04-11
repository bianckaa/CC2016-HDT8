public class AdaptadorVectorHeap<E extends Comparable<E>> implements IPriorityQueue<E> {
    private VectorHeap<E> heap;

    public AdaptadorVectorHeap() {
        heap = new VectorHeap<>();
    }

    @Override
    public void add(E value) {
        heap.add(value);
    }

    @Override
    public E remove() {
        return heap.remove();
    }

    @Override
    public E peek() {
        return heap.peek();
    }

    @Override
    public boolean isEmpty() {
        return heap.isEmpty();
    }
}
