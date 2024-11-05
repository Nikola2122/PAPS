package P3ZADACI;

public class SLLNode <E>{
    public E data;
    public SLLNode<E> next;

    public SLLNode(E data){
        this.data = data;
        this.next = null;
    }
    public SLLNode(E data, SLLNode<E> next) {
        this.data = data;
        this.next = next;
    }
    @Override
    public String toString(){
        return data.toString();
    }
}
