import java.util.Scanner;

public class MYLABS2 {
    public static void putWordsTogether(SLL<String> lista){
        SLL<String> lista2 = new SLL<>();
        SLLNode<String> tmp = lista.first;
        int flag = 0;
        String zbor = tmp.data;
        while(tmp.next != null){
            tmp = tmp.next;
            if(tmp.data.equals(",")){
                if(flag==0){
                    SLLNode<String> prv = new SLLNode<>(zbor);
                    lista2.first = prv;
                }
                else {
                    SLLNode<String> nov = new SLLNode<>(zbor);
                    SLLNode<String> tmpp = lista2.first;
                    while(tmpp.next != null){
                        tmpp = tmpp.next;
                    }
                    tmpp.next = nov;
                    zbor="";
                }
                flag += 1;
                tmp = tmp.next;
            }
            zbor+=tmp.data;
        }
        lista.first=lista2.first;
    }
    public static void main(String[] args) {
        SLL<String> lista = new SLL<>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String jazol;
        for (int i = 0; i < n; i++) {
            jazol=input.next();
            SLLNode<String> tmp = new SLLNode<>(jazol);
            if(i==0){
                lista.insertFirst(jazol);
            }
            else{
                lista.insertLast(jazol);
            }
        }
        putWordsTogether(lista);
        System.out.println(lista);
    }
}
