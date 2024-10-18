package P1ZADACI;
public class IZBRISI_POSLEDNO_POJAVUVANJE {
    static void izbrisiPoslednoPojavuavnje(SLL<Integer> niza, Integer data){
            SLLNode<Integer> tmp = niza.first;
            SLLNode<Integer> posledno = null;
            if(tmp.data.equals(data)){
                posledno = tmp;
            }
            while(tmp.next!=null){
                tmp = tmp.next;
                if(tmp.data.equals(data)){
                    posledno = tmp;
                }
            }
            niza.remove(posledno);
    }
    public static void main(String[] args) {
        SLL<Integer> lista = new SLL<Integer>();
        lista.insertFirst(4);
        lista.insertLast(6);
        lista.insertLast(4);
        lista.insertLast(9);
        lista.insertLast(3);
        izbrisiPoslednoPojavuavnje(lista,4);
        System.out.println(lista);
    }
}
