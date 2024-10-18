package P2ZADACI;

import java.util.Scanner;

public class PALINDROM {
    static int daliEPalindrom(DLL<Integer> lista) {
        int palindorm = 1;
        DLLNode<Integer> start = lista.first;
        DLLNode<Integer> end = lista.last;
        while (start != end && start.next != end) {
            if (!start.data.equals(end.data)) {
                palindorm = -1;
                break;
            }
            start = start.next;
            end = end.prev;
        }
        return palindorm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLL<Integer> lista = new DLL<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Integer x = sc.nextInt();
            lista.insertFirst(x);
        }
        System.out.println(daliEPalindrom(lista));
    }
}
