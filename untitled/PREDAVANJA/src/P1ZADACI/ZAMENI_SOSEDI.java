package P1ZADACI;

public class ZAMENI_SOSEDI {
    static void zameniSosedi(SLL<Integer> lista){
        SLLNode<Integer> tmp = lista.first;
        SLLNode<Integer> next = tmp.next;
        tmp.next = next.next;
        next.next = tmp;
        lista.first = next;
        while(tmp.next != null){
            SLLNode<Integer> prev = tmp;
            tmp = tmp.next;
            next = tmp.next;
            if(next == null){
                break;
            }
            tmp.next = next.next;
            next.next = tmp;
            prev.next = next;
        }
    }
    public static void main(String[] args) {
        SLL<Integer> lista = new SLL<Integer>();
        lista.insertFirst(4);
        lista.insertLast(6);
        lista.insertLast(4);
        lista.insertLast(9);
        lista.insertLast(8);
        lista.insertLast(7);
        lista.insertLast(5);
        System.out.println(lista);
        zameniSosedi(lista);
        System.out.println(lista);
    }
}
