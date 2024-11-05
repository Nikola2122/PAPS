package P3ZADACI.QUEUES;

import P3ZADACI.SLLNode;

public class LinkedQueue<E> implements Queue<E> {
    protected SLLNode<E> front;
    protected SLLNode<E> rear;
    int size;
    public LinkedQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    @Override
    public void clear() {
        front = null;
        rear = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void enqueue(E e) {
        SLLNode<E> nov = new SLLNode<E>(e);
        if(front==null) {
            front = nov;
            rear = nov;
            size++;
        }
        else {
            rear.next = nov;
            rear = nov;
            size++;
        }
    }

    @Override
    public E dequeue() {
        if(front==null) {
            return null;
        }
        else{
            E vrati = front.data;
            front = front.next;
            if(front==null) {
                rear = null;
            }
            size--;
            return vrati;
        }
    }

    @Override
    public E peek() {
        if(front==null) {
            return null;
        }
        return front.data;
    }

    @Override
    public E peekRear() {
        if(front==null) {
            return null;
        }
        return rear.data;
    }
    @Override
    public String toString(){
        String ret="";
        SLLNode<E> temp = front;
        while(temp!=null) {
            ret+=temp.data+" ";
            temp=temp.next;
        }
        return ret;
    }
}
