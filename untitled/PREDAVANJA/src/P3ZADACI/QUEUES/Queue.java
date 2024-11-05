package P3ZADACI.QUEUES;

public interface Queue <E>{
    void clear();
    boolean isEmpty();
    int size();
    void enqueue(E e);
    E dequeue();
    E peek();
    E peekRear();
}
