import java.util.PriorityQueue;

public class MyPriorityQueue<E extends Comparable<E>> implements IPriorityQueue<E> {
    private PriorityQueue<E> internalQueue;

    public MyPriorityQueue() {
        internalQueue = new PriorityQueue<>();
    }

    @Override
    public void add(E value) {
        internalQueue.add(value);
    }

    @Override
    public E remove() {
        return internalQueue.poll();
    }

    @Override
    public E peek() {
        return internalQueue.peek();
    }

    @Override
    public boolean isEmpty() {
        return internalQueue.isEmpty();
    }
}
