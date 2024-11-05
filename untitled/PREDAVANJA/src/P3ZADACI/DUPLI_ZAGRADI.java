package P3ZADACI;

import java.util.Scanner;

public class DUPLI_ZAGRADI {
    static boolean zagrada(char c){
        switch (c){
            case '(': return true;
            case ')': return true;
            case '{': return true;
            case '}': return true;
            case '[': return true;
            case ']': return true;
            default: return false;
        }
    }
    static String dupliZagradi(String izraz){
        LinkedStack<Character> stek = new LinkedStack<>();
        char predPos = ' ';
        for (int i = 0; i < izraz.length(); i++) {
            if(zagrada(izraz.charAt(i))){
                if(stek.isEmpty() && (izraz.charAt(i) == ')' || izraz.charAt(i) == '}' || izraz.charAt(i) == ']')){
                    return "Netocni Zagradi";
                }
                else{
                    if(izraz.charAt(i) == ')' || izraz.charAt(i) == '}' || izraz.charAt(i) == ']'){
                        if(izraz.charAt(i) == ')' && stek.peek().equals('(')){
                            if(predPos==stek.peek()){
                                return "Dupli Zagradi";
                            }
                            predPos = stek.pop();
                        }
                        else if(izraz.charAt(i) == '}' && stek.peek().equals('{')){
                            if(predPos==stek.peek()){
                                return "Dupli Zagradi";
                            }
                            predPos = stek.pop();
                        }
                        else if(izraz.charAt(i) == ']' && stek.peek().equals('[')){
                            if(predPos==stek.peek()){
                                return "Dupli Zagradi";
                            }
                            predPos = stek.pop();
                        }
                        else{
                            return "Netocni Zagradi";
                        }
                    }
                    else{
                        stek.push(izraz.charAt(i));
                    }
                }
            }
        }
        return "/";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String izraz = sc.nextLine();
        System.out.println(dupliZagradi(izraz));
    }
}
