package P3ZADACI;


public class LinkedStack <E> implements Stack<E> {
    protected SLLNode<E> top;
    protected int size;
    public LinkedStack() {
        top = null;
        size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void push(E e) {
        SLLNode<E> nov = new SLLNode<>(e,top);
        top = nov;
        size++;
    }
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E e = top.data;
        top = top.next;
        size--;
        return e;
    }
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return top.data;
    }
    public int size() {
        return size;
    }
    public void clear(){
        top = null;
        size = 0;
    }
    public String toString(){
        String ret="";
        SLLNode<E> temp = top;
        while(temp!=null){
            ret+=temp.data+" ";
            temp=temp.next;
        }
        return ret;
    }
}
