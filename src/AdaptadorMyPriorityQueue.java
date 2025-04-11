public class AdaptadorMyPriorityQueue<E extends Comparable<E>> implements IPriorityQueue<E> {
    private IPriorityQueue<E> queue;

    public AdaptadorMyPriorityQueue() {
        queue = new MyPriorityQueue<>();
    }

    @Override
    public void add(E value) {
        queue.add(value);
    }

    @Override
    public E remove() {
        return queue.remove();
    }

    @Override
    public E peek() {
        return queue.peek();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
