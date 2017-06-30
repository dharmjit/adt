package pqadt;

public interface PriorityQueueInterface<K, V> {
    boolean isEmpty();

    boolean isFull();

    void enqueue(K key, V value);

    Entry<K, V> deque();
}
