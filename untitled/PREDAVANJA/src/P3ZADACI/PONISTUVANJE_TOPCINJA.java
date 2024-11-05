package P3ZADACI;

import java.util.Scanner;

public class PONISTUVANJE_TOPCINJA {
    static LinkedStack<String> vratiOstanati(LinkedStack<String> stek){
        LinkedStack<String> vrati = new LinkedStack<>();
        LinkedStack<String> rp=new LinkedStack<>();
        LinkedStack<String> rm=new LinkedStack<>();
        LinkedStack<String> gp=new LinkedStack<>();
        LinkedStack<String> gm=new LinkedStack<>();
        LinkedStack<String> bp=new LinkedStack<>();
        LinkedStack<String> bm=new LinkedStack<>();
        while(!stek.isEmpty()){
            String curr = stek.pop();
            switch (curr) {
                case "R+" -> rp.push(curr);
                case "R-" -> rm.push(curr);
                case "G+" -> gp.push(curr);
                case "G-" -> gm.push(curr);
                case "B+" -> bp.push(curr);
                case "B-" -> bm.push(curr);
            }
        }
        int vk = 0;
        if(rp.size()>rm.size){
            int broj = rp.size()-rm.size();
            vk+=broj;
            while(broj!=0){
                vrati.push("R-");
                broj--;
            }
        } else {
            int broj = rm.size()-rp.size();
            vk+=broj;
            while(broj!=0){
                vrati.push("R+");
                broj--;
            }
        }
        if(gp.size()>gm.size()) {
            int broj = gp.size() - gm.size();
            vk += broj;
            while (broj != 0) {
                vrati.push("G-");
                broj--;
            }
        } else{
            int broj = gm.size() - gp.size();
            vk += broj;
            while (broj != 0) {
                vrati.push("G+");
                broj--;
            }
        }
        if(bp.size()>bm.size()) {
            int broj = bp.size() - bm.size();
            vk += broj;
            while (broj != 0) {
                vrati.push("B-");
                broj--;
            }
        } else{
            int broj = bm.size() - bp.size();
            vk += broj;
            while (broj != 0) {
                vrati.push("B+");
                broj--;
            }
        }
        LinkedStack<String> vrati2=new LinkedStack<>();
        while(!vrati.isEmpty()){
            vrati2.push(vrati.pop());
        }
        System.out.println(vk);
        return vrati2;
    }

    public static void main(String[] args) {
        int n;
        LinkedStack<String> stek=new LinkedStack<>();
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            stek.push(sc.next());
        }
        LinkedStack<String> vrati=vratiOstanati(stek);
        System.out.println(vrati);
    }
}
