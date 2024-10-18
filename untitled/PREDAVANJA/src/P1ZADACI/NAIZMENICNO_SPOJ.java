package P1ZADACI;

import java.util.Scanner;

public class NAIZMENICNO_SPOJ {
    static SLL<Integer> spoenaLista(SLL<Integer> lista1, SLL<Integer> lista2) {
        SLL<Integer> spoenaLista = new SLL<Integer>();
        SLLNode<Integer> tmp = lista1.first;
        SLLNode<Integer> tmp2 = lista2.first;
        boolean flag = false;
        while (tmp != null && tmp2 != null) {
            if(!flag) {
                for (int i = 0; i < 2 && tmp!=null; i++) {
                    spoenaLista.insertLast(tmp.data);
                    tmp = tmp.next;
                }
                flag = true;
            }
            else{
                for (int i = 0; i < 2 && tmp2!=null; i++) {
                    spoenaLista.insertLast(tmp2.data);
                    tmp2 = tmp2.next;
                }
                flag = false;
            }
        }
        if(tmp!=null){
            while(tmp!=null){
                spoenaLista.insertLast(tmp.data);
                tmp = tmp.next;
            }
        }
        if(tmp2!=null){
            while(tmp2!=null){
                spoenaLista.insertLast(tmp2.data);
                tmp2 = tmp2.next;
            }
        }
        return spoenaLista;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SLL<Integer> lista = new SLL<>();
        SLL<Integer> lista2 = new SLL<>();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            Integer x = input.nextInt();
            SLLNode<Integer> node = new SLLNode<>(x);
            lista.insertLast(node);
        }
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            Integer x = input.nextInt();
            SLLNode<Integer> node = new SLLNode<>(x);
            lista2.insertLast(node);
        }
        SLL<Integer> nova = spoenaLista(lista, lista2);
        System.out.println(nova);
    }
}
