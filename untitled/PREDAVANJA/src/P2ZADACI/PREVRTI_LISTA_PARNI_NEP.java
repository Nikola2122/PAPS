package P2ZADACI;

import java.util.Scanner;

public class PREVRTI_LISTA_PARNI_NEP {
    static void prevrtiParnost(DLL<Integer> lista) {
        DLLNode<Integer> tmp = lista.last;
        DLLNode<Integer> poslednoPref = null;
        boolean flag = true;
        while (tmp != null && tmp != poslednoPref) {
            DLLNode<Integer> next = tmp.prev;
            if (tmp.data % 2 == 0 && flag) {
                lista.insertFirst(tmp.data);
                poslednoPref = lista.find(tmp.data);
                lista.remove(tmp);
                flag = false;
            } else if (tmp.data % 2 == 0) {
                lista.insertAfter(tmp.data, poslednoPref);
                poslednoPref = lista.find(tmp.data);
                lista.remove(tmp);
            }
            tmp = next;
        }
        tmp = lista.last;
        DLLNode<Integer> posleden = poslednoPref.next;
        while(tmp != null && tmp!=poslednoPref){
            DLLNode<Integer> next = tmp.prev;
            lista.insertAfter(tmp.data,poslednoPref);
            poslednoPref = lista.find(tmp.data);
            lista.remove(tmp);
            tmp = next;
            if(posleden==tmp){
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DLL<Integer> lista = new DLL<>();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            Integer x = input.nextInt();
            DLLNode<Integer> node = new DLLNode<>(x);
            lista.insertLast(node);
        }
        prevrtiParnost(lista);
        System.out.println(lista);
    }
}
