package P2ZADACI;

import java.util.Scanner;

public class NAPRAVI_SLL {
    static void napraviSLL1(DLL<String> lista){
        DLLNode<String> tmp = lista.last;
        DLLNode<String> prev = tmp;
        DLLNode<String> novPrv = tmp;
        while(tmp!=null) {
            tmp.next = prev;
//            prev = tmp;
            tmp = tmp.next;
        }
        System.out.println(novPrv);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DLL<String> lista = new DLL<>();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            String x = input.next();
            DLLNode<String> node = new DLLNode<>(x);
            lista.insertLast(node);
        }
        napraviSLL1(lista);
        System.out.println(lista);
    }
}
