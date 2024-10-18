public class MYLABS1 {
    static void makeZigZag(SLL<Integer> lista){
        SLLNode<Integer> tmp = lista.getFirst();
        while(tmp.next!=null){
            if(tmp.data == 0 && tmp.next.data == 0){
                lista.remove(tmp.data);
                lista.remove(tmp.next.data);
            }
            else if (tmp.data == 0 || tmp.next.data == 0) {
                if(tmp.data==0){
                    lista.remove(tmp.data);
                }
                else{
                    lista.remove(tmp.next.data);
                }
            }
            else if(tmp.data>0 && tmp.next.data>0){
                lista.remove(tmp.next.data);
            }
            else if(tmp.data<0 && tmp.next.data<0){
                int abs = tmp.data * -1;
                lista.insertAfter(tmp.data, abs);
            }
            tmp = tmp.next;
        }
    }
    public static void main(String[] args){
        SLL<Integer> lista = new SLL<Integer>();
        lista.insertFirst(4);
        lista.insertLast(-3);
        lista.insertLast(-6);
        lista.insertLast(0);
        lista.insertLast(7);
        lista.insertLast(7);
        lista.insertLast(-2);
        lista.insertLast(5);
        makeZigZag(lista);
        System.out.println(lista);
    }

}
