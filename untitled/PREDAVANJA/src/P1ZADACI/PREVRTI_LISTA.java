package P1ZADACI;

import java.util.Scanner;

public class PREVRTI_LISTA {
    static void prevrtiLista(SLL<Integer> lista) {
        SLLNode<Integer> tmp = lista.first;
        SLLNode<Integer> prev = null;
        SLLNode<Integer> next = tmp.next;
        while (next != null) {
            tmp.next = prev;
            prev = tmp;
            tmp = next;
            next = tmp.next;
        }
        tmp.next = prev;
        lista.first = tmp;
    }
    public static void main(String[] args) {
        SLL<Integer> lista = new SLL<>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            Integer num = input.nextInt();
            if(i==0){
                lista.insertFirst(new SLLNode<Integer>(num));
            }
            else {
                lista.insertLast(new SLLNode<Integer>(num));
            }
        }
        prevrtiLista(lista);
        System.out.println(lista);
    }
}
