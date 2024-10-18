package P1ZADACI;

import java.util.Scanner;

public class BRISI_JAZLI {
    static void brisiJazli(SLL<Integer> lista){
        int brojac = 1;
        SLLNode<Integer> tmp = lista.first;
        while(tmp != null){
            SLLNode<Integer> tmp2 = tmp;
            for (int i = 0; i < brojac && tmp2 != null; i++) {
                tmp2 = tmp2.next;
            }
            if(tmp2==null){
                break;
            }
            lista.remove(tmp2.data);
            brojac++;
            tmp = tmp.next;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SLL<Integer> lista = new SLL<>();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            Integer x = input.nextInt();
            SLLNode<Integer> node = new SLLNode<>(x);
            lista.insertLast(node);
        }
        brisiJazli(lista);
        System.out.println(lista);
    }
}
