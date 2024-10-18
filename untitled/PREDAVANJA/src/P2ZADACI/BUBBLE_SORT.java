package P2ZADACI;

import java.util.Scanner;

public class BUBBLE_SORT {
    public static void bubbleSort(DLL<Integer> lista){
        boolean swapped = true;
        while(swapped){
            swapped = false;
            for (DLLNode<Integer> tmp = lista.first; tmp.next != null; tmp = tmp.next){
                if(tmp.data > tmp.next.data){
                    lista.swap(tmp,tmp.next);
                    swapped = true;
                    tmp=tmp.prev;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DLL<Integer> lista = new DLL<>();
        for (int i = 0; i < n; i++) {
            Integer x = sc.nextInt();
            lista.insertLast(new DLLNode<Integer>(x));
        }
        bubbleSort(lista);
        System.out.println(lista);
    }
}
