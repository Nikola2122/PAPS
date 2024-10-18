public class SLL<E> {
    protected SLLNode<E> first;

    SLL() {
        this.first = null;
    }

    SLLNode<E> getFirst() {
        return this.first;
    }

    void insertFirst(E node) {
        SLLNode<E> novPrv = new SLLNode<E>(node);
        novPrv.next = first;
        first = novPrv;
    }

    void remove(E node) {
        SLLNode<E> tmp = first;
        if (node == tmp.data) {
            first = first.next;
        } else {
            while (tmp.next.data != node) {
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
        }
    }

    void remove(SLLNode<E> node) {
        SLLNode<E> tmp = first;
        if (node == tmp) {
            first = first.next;
        } else {
            while (tmp.next != node) {
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
        }
    }

    void insertLast(E node) {
        SLLNode<E> nov = new SLLNode<E>(node);
        SLLNode<E> tmp = first;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = nov;
    }

    public void insertAfter(SLLNode<E> data, E node) {
        SLLNode<E> nov = new SLLNode<E>(node);
        SLLNode<E> tmp = first;
        while (tmp != data) {
            tmp = tmp.next;
        }
        nov.next = tmp.next;
        tmp.next = nov;
    }

    public void insertAfter(E data, E node) {
        SLLNode<E> nov = new SLLNode<E>(node);
        SLLNode<E> tmp = first;
        while (!tmp.data.equals(data)) {
            tmp = tmp.next;
        }
        nov.next = tmp.next;
        tmp.next = nov;
    }

    @Override
    public String toString() {
        String ret = "";
        SLLNode<E> tmp = first;
        ret += tmp;
        while (tmp.next != null) {
            tmp = tmp.next;
            ret += "->" + tmp;
        }
        return ret;
    }
}