package P2ZADACI;

import java.util.Scanner;

public class LISTA_OD_LISTI {
    static int lista_od_listi(DLL<DLL<Integer>> listaOdListi) {
        DLLNode<DLL<Integer>> tmp = listaOdListi.first;
        int proizvod = 1;
        while (tmp != null) {
            DLLNode<Integer> tmp2 = tmp.data.first;
            Integer suma = 0;
            while (tmp2 != null) {
                suma += tmp2.data;
                tmp2 = tmp2.next;
            }
            proizvod *= suma;
            tmp = tmp.next;
        }
        return proizvod;
    }

    public static void main(String[] args) {
        DLL<DLL<Integer>> listaOdListi = new DLL<DLL<Integer>>();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for (int i = 0; i < n; i++) {
            DLL<Integer> lista = new DLL<>();
            for (int j = 0; j < m; j++) {
                Integer x = sc.nextInt();
                lista.insertLast(x);
            }
            System.out.println(lista);
            listaOdListi.insertLast(lista);
        }
        System.out.println(listaOdListi);
        int suma = lista_od_listi(listaOdListi);
        System.out.println(suma);
    }
}
