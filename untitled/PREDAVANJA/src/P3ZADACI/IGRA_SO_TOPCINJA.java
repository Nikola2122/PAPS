package P3ZADACI;

import java.util.Objects;
import java.util.Scanner;

public class IGRA_SO_TOPCINJA {
    static LinkedStack<String> vrniTopki(LinkedStack<String> kutija1 ){
        LinkedStack<String> kutija2 = new LinkedStack<>();
        LinkedStack<String> kutija3 = new LinkedStack<>();
        int brojPlavi = 0;
        int bomba = 0;
        while(!kutija1.isEmpty()){
            String x = kutija1.pop();
            if(Objects.equals(x, "R") && bomba==2){
                bomba++;
                while(bomba!=0){
                    bomba--;
                    kutija3.pop();
                }
            }
            else if(Objects.equals(x, "R")){
                kutija3.push(x);
                bomba++;
            }
            else if(Objects.equals(x, "G")){
                kutija2.push(x);
            }
            else{
                brojPlavi++;
            }
        }
        while(!kutija2.isEmpty()){
            kutija3.push(kutija2.pop());
        }
        while(brojPlavi!=0){
            kutija3.push("B");
            brojPlavi--;
        }
        return kutija3;
    }
    public static void main(String[] args) {
        LinkedStack<String> kutija = new LinkedStack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            kutija.push(sc.next());
        }
        System.out.println(vrniTopki(kutija));
    }
}
