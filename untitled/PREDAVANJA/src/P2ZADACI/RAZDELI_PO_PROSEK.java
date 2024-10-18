package P2ZADACI;


import java.util.Scanner;

public class RAZDELI_PO_PROSEK {
    static DLL<Integer> podeliVoDveListi(DLL<Integer> lista){
        int suma = 0;
        DLLNode<Integer> tmp = lista.first;
        while(tmp != null){
            suma += tmp.data;
            tmp = tmp.next;
        }
        float prosek = (float) suma / lista.size();
        tmp = lista.last;
        DLL<Integer> pomali = new DLL<>();
        DLL<Integer> pogolemi = new DLL<>();
        while(tmp != null){
            if(tmp.data<=prosek){
                pomali.insertLast(tmp.data);
            }
            else{
                pogolemi.insertLast(tmp.data);
            }
            tmp = tmp.prev;
        }
        return pogolemi;
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
        DLL<Integer> nova = podeliVoDveListi(lista);
        System.out.println(nova);
    }
}
