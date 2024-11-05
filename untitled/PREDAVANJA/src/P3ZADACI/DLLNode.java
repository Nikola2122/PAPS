package P3ZADACI;

public class DLLNode <E> {
    protected E data;
    protected DLLNode<E> next;
    protected DLLNode<E> prev;
    public DLLNode() {
        data = null;
        next = null;
        prev = null;
    }
    public DLLNode(E data) {
        this.data = data;
        next = null;
        prev = null;
    }
    public DLLNode(E data, DLLNode<E> prev, DLLNode<E> next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
    @Override
    public String toString() {
        return data.toString();
    }
}
