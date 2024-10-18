package P2ZADACI;

public class DLLNode<E> {
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
    public DLLNode(E data, DLLNode<E> next, DLLNode<E> prev) {
        this.data = data;
        next = null;
        prev = null;
    }
    @Override
    public String toString() {
        return data.toString();
    }
}
