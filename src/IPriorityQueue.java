public interface IPriorityQueue<E extends Comparable<E>> {
    void add(E value);
    E remove();
    boolean isEmpty();
    E peek();
}
