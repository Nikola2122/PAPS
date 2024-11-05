package P3ZADACI;

import java.util.Scanner;

public class ISPITNA_SESIJA {
    static LinkedStack<String> sesija(LinkedStack<String> knigi, LinkedStack<String> ispiti) {
        LinkedStack<String> tmp = new LinkedStack<>();
        int brojac;
        while(!ispiti.isEmpty()){
            brojac = 1;
            String curr = ispiti.pop();
            String najdena;
            while(true){
                String kniga = knigi.pop();
                if(kniga.charAt(kniga.length()-1)<'0' || kniga.charAt(kniga.length()-1)>'9'){
                    kniga+=" 0";
                }
                int novBroj = Integer.parseInt(kniga.charAt(kniga.length()-1)+"");
                novBroj+=brojac;
                String novaKniga = kniga.substring(0,kniga.length()-2)+" "+novBroj;
                if(novaKniga.substring(0,novaKniga.length()-2).equals(curr)){
                    najdena=novaKniga;
                    break;
                }
                tmp.push(novaKniga);
            }
            while(!tmp.isEmpty()){
                knigi.push(tmp.pop());
            }
            knigi.push(najdena);
        }
        return knigi;
    }

    public static void main(String[] args) {
        LinkedStack<String> knigi = new LinkedStack<>();
        LinkedStack<String> ispiti = new LinkedStack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            knigi.push(sc.next());
        }
        n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            ispiti.push(sc.next());
        }
        System.out.println(sesija(knigi,ispiti));
    }
}
