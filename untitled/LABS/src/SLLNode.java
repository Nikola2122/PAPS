public class SLLNode<E> {
    protected E data;
    protected SLLNode<E> next;

    public SLLNode(E data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        String ret = "";
        ret += data;
        return ret;
    }
}
