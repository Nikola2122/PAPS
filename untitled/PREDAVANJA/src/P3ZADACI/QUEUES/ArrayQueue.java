package P3ZADACI.QUEUES;

import java.util.NoSuchElementException;

public class ArrayQueue <E> implements Queue<E> {
    protected E[] array;
    protected int front;
    protected int rear;
    protected int size;
    public ArrayQueue(int capacity) {
        array = (E[]) new Object[capacity];
        size = 0;
        front = 0;
        rear = 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        front = 0;
        rear = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void enqueue(E e) {
        if(size == array.length) {
            throw new NoSuchElementException();
        }
        else {
            array[rear++]=e;
            if(rear==array.length) {
                rear = 0;
            }
            size++;
        }
    }

    @Override
    public E dequeue() {
        if(size == 0) {
            throw new NoSuchElementException();
        }
        else{
            E tmp = array[front];
            array[front] = null;
            front++;
            if(front == array.length) {
                front = 0;
            }
            size--;
            return tmp;
        }
    }

    @Override
    public E peek() {
        return array[front];
    }

    @Override
    public E peekRear() {
        return array[rear];
    }
}
