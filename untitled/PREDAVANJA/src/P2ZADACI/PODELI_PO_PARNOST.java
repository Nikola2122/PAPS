package P2ZADACI;

import java.util.Scanner;

public class PODELI_PO_PARNOST {
    static DLL<Integer> podeliLista(DLL<Integer> lista) {
        DLL<Integer> parni = new DLL<>();
        DLL<Integer> neparni = new DLL<>();
        DLLNode<Integer> start = lista.first;
        DLLNode<Integer> end = lista.last;
        boolean flag = false;
        while(end.next != start) {
            if(!flag){
                if(start.data%2==0){
                    parni.insertLast(start.data);
                }
                else{
                    neparni.insertLast(start.data);
                }
                flag = true;
                start = start.next;
            }
            else{
                if(end.data%2==0){
                    parni.insertLast(end.data);
                }
                else{
                    neparni.insertLast(end.data);
                }
                flag = false;
                end = end.prev;
            }
        }
        return parni;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DLL<Integer> lista = new DLL<>();
        for (int i = 0; i < n; i++) {
            Integer x = sc.nextInt();
            lista.insertLast(new DLLNode<Integer>(x));
        }
        DLL<Integer> nova = podeliLista(lista);
        System.out.println(nova);
    }
}
