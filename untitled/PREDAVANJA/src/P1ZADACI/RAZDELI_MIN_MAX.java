package P1ZADACI;

import java.util.Scanner;

public class RAZDELI_MIN_MAX {
    static SLL<Integer> razdeliLista(SLL<Integer> lista) {
        SLL<Integer> najmali = new SLL<Integer>();
        SLL<Integer> najgolemi = new SLL<Integer>();
        SLLNode<Integer> min = lista.first;
        SLLNode<Integer> max = lista.first;
        SLLNode<Integer> tmp = lista.first;
        while(tmp!=null) {
            if(tmp.data<min.data){
                min = tmp;
            }
            if(tmp.data>max.data){
                max = tmp;
            }
            tmp = tmp.next;
        }
        tmp = lista.first;
        while(tmp!=null) {
            Integer razlikaSoNajmal = Math.abs(min.data-tmp.data);
            Integer razlikaSoNajgolem = Math.abs(max.data-tmp.data);
            if(razlikaSoNajmal>razlikaSoNajgolem){
                najgolemi.insertLast(tmp.data);
            }
            else if(razlikaSoNajmal==razlikaSoNajgolem){
                najmali.insertLast(tmp.data);
            }
            else {
                najmali.insertLast(tmp.data);
            }
            tmp = tmp.next;
        }
        // return najgolemi;
        return najmali;
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
        System.out.println(razdeliLista(lista));
    }
}
