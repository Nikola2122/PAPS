package P3ZADACI;

import java.util.Scanner;

public class ZAGRADI {
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
    static boolean tocniZagradi(String izraz){
        LinkedStack<Character> stek = new LinkedStack<>();
        for (int i = 0; i < izraz.length(); i++) {
            if(zagrada(izraz.charAt(i))){
                if(stek.isEmpty() && (izraz.charAt(i) == ')' || izraz.charAt(i) == '}' || izraz.charAt(i) == ']')){
                    return false;
                }
                else{
                    if(izraz.charAt(i) == ')' || izraz.charAt(i) == '}' || izraz.charAt(i) == ']'){
                        if(izraz.charAt(i) == ')' && stek.peek().equals('(')){
                            stek.pop();
                        }
                        else if(izraz.charAt(i) == '}' && stek.peek().equals('{')){
                            stek.pop();
                        }
                        else if(izraz.charAt(i) == ']' && stek.peek().equals('[')){
                            stek.pop();
                        }
                        else{
                            return false;
                        }
                    }
                    else{
                        stek.push(izraz.charAt(i));
                    }
                }
            }
        }
        System.out.println(stek);
        return stek.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String izraz = sc.nextLine();
        System.out.println(tocniZagradi(izraz));
    }
}
