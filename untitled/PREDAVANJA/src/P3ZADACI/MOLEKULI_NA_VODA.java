package P3ZADACI;

import java.util.Scanner;

public class MOLEKULI_NA_VODA {
    static LinkedStack<String> vratiMolekuli(LinkedStack<String> stek){
        LinkedStack<String> vrati = new LinkedStack<>();
        int broj=0;
        int H=0;
        int O=0;
        while(!stek.isEmpty()){
            String curr = stek.pop();
            if(curr.equals("H")){
                H++;
            }
            else{
                O++;
            }
        }
        int polaH=H/2;
        int molekuliOstanati = polaH-O;
        if(molekuliOstanati==0 && H%2==0){
            vrati.push(Integer.toString(polaH));
        }
        else if(molekuliOstanati==0 && H%2==1){
            vrati.push(Integer.toString(polaH));
            vrati.push("H");
        }
        else if(molekuliOstanati>0){
            int tmp = molekuliOstanati;
            while(tmp!=0){
                vrati.push("H");
                tmp--;
            }
            if(H%2==1){
                vrati.push("H");
            }
            vrati.push(Integer.toString(polaH));
        }
        else if(molekuliOstanati<0){
            int tmp = molekuliOstanati;
            while(tmp!=0){
                vrati.push("O");
                tmp++;
            }
            if(H%2==1){
                vrati.push("H");
            }
            vrati.push(Integer.toString(polaH));
        }
        return vrati;
    }
    public static void main(String[] args) {
        int n;
        LinkedStack<String> stek=new LinkedStack<>();
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            stek.push(sc.next());
        }
        LinkedStack<String> vrati = vratiMolekuli(stek);
        System.out.println(vrati);
    }
}
