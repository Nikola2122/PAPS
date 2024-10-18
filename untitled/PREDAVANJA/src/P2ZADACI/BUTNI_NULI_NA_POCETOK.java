package P2ZADACI;
import java.util.Scanner;

public class BUTNI_NULI_NA_POCETOK {
    static void butniNuli(DLL<Integer> lista){
        DLLNode<Integer> tmp = lista.first;
        while(tmp != null){
            DLLNode<Integer> next = tmp.next;
            if(tmp.data.equals(0) && tmp!=lista.first){
                lista.remove(tmp);
                lista.insertFirst(0);
            }
            tmp = next;
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
        butniNuli(lista);
        System.out.println(lista);
    }
}
