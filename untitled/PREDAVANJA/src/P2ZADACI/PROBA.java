package P2ZADACI;

import java.util.Scanner;

public class PROBA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DLL<Integer> lista = new DLL<>();
        for (int i = 0; i < n; i++) {
            Integer x = sc.nextInt();
            lista.insertLast(new DLLNode<Integer>(x));
        }
        DLLNode<Integer> tmp = new DLLNode<>(10);
        DLLNode<Integer> tmp2 = new DLLNode<>(20);
        DLLNode<Integer> tmp3 = new DLLNode<>(30);
        DLLNode<Integer> tmp4 = new DLLNode<>(40);
        lista.insertFirst(tmp);
        lista.insertLast(tmp2);
        lista.insertLast(tmp3);
        lista.insertFirst(tmp4);

//        lista.insertLast(110);
        lista.swap(tmp2,tmp3);
//        lista.testSwap(tmp4,tmp);
        System.out.println(lista);
    }
}
