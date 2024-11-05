package P3ZADACI;

public interface Stack <E>{
    public void push(E e);
    public E pop();
    public E peek();
    public boolean isEmpty();
    public int size();
    public void clear();
}
