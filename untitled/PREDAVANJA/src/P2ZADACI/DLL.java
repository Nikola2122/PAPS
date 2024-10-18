package P2ZADACI;

public class DLL<E> {
    protected DLLNode<E> first;
    protected DLLNode<E> last;
    public DLL() {
        first = null;
        last = null;
    }
    void insertFirst(E data) {
        if (first == null) {
            DLLNode<E> novPrv = new DLLNode<>(data);
            first = novPrv;
            last = novPrv;
        }
        else{
            DLLNode<E> novPrv = new DLLNode<>(data,null,null);
            novPrv.next = first;
            first = novPrv;
        }
    }
    void insertFirst(DLLNode<E> node) {
        if (first == null) {
            first = node;
            last = node;
        }
        else{
            node.next = first;
            first.prev = node;
            first = node;
        }
    }
    void swap(DLLNode<E> a, DLLNode<E> b) {
        if(a==first){
            b.prev = null;
            a.next = b.next;
            a.next.prev = a;
            b.next = a;
            a.prev = b;
            first = b;
        }
        else if(b==last){
            a.next = null;
            b.next = a;
            b.prev=a.prev;
            a.prev = b;
            b.prev.next = b;
            last = a;
        }
        else {
            a.prev.next = b;
            b.prev = a.prev;
            a.prev = b;
            a.next = b.next;
            b.next.prev = a;
            b.next = a;
        }
    }
    void insertAfter(E data, DLLNode<E> node) {
        DLLNode<E> nov = new DLLNode<>(data);
        if(node == first && node == last){
            first.next = nov;
            nov.prev = first;
            nov.next = null;
            last = nov;
        }
        else if(node == last){
            last.next = nov;
            nov.prev = last;
            nov.next = null;
            last = nov;
        }
        else{
            nov.next = node.next;
            node.next.prev = nov;
            node.next = nov;
            nov.prev = node;
        }
    }
    void insertLast(E data) {
        if(first == null) {
            insertFirst(data);
        }
        else{
            DLLNode<E> novPos = new DLLNode<>(data,null,last);
            last.next = novPos;
            last = novPos;
        }
    }
    void insertLast(DLLNode<E> node) {
        if(first == null) {
            insertFirst(node);
        }
        else{
            last.next = node;
            node.prev = last;
            last = node;
        }
    }
    DLLNode<E> find (E data){
        DLLNode<E> tmp = first;
        while(tmp!=null && !tmp.data.equals(data)){
            tmp = tmp.next;
        }
        return tmp;
    }
    void remove(DLLNode<E> node) {
        if(node == first && node == last) {
            first = last = null;
        }
        else if(node == first) {
            first = first.next;
            first.prev = null;
        }
        else if(node == last){
            last = last.prev;
            last.next.prev = null;
            last.next = null;
        }
        else{
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }
    int size(){
        int size = 0;
        DLLNode<E> tmp = first;
        while(tmp != null){
            size++;
            tmp = tmp.next;
        }
        return size;
    }
    @Override
    public String toString (){
        if(first!=null) {
            String ret = "";
            DLLNode<E> tmp = first;
            ret += tmp;
            while (tmp.next != null) {
                tmp = tmp.next;
                ret += "<->" + tmp;
            }
            return ret;
        }
        else{
            return "";
        }
    }
    public String toStringR(){
        if(last!=null) {
            String ret = "";
            DLLNode<E> tmp = last;
            ret += tmp;
            while (tmp.prev != null) {
                tmp = tmp.prev;
                ret += "<->" + tmp;
            }
            return ret;
        }
        else{
            return "";
        }
    }
}
