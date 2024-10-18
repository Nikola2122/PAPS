package P2ZADACI;

import java.util.Scanner;

public class VMETNI_PROSEK_SOSEDI {
    static void vmetniProsek(DLL<Integer> lista){
        DLLNode<Integer> tmp = lista.first;
        while(tmp.next!=null){
            double prosek = (double)(tmp.data+tmp.next.data)/2;
            int prosek2 = (int) Math.round(prosek);
            lista.insertAfter(prosek2,tmp);
            tmp = tmp.next.next;
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
        vmetniProsek(lista);
        System.out.println(lista);
    }
}
