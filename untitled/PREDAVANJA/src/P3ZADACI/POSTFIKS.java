package P3ZADACI;

import java.util.Scanner;

public class POSTFIKS {
    static int operacija(char c, int operand1, int operand2){
        switch (c){
            case '+': return operand1 + operand2;
            case '-': return operand1 - operand2;
            case '*': return operand1 * operand2;
            case '/': return operand1 / operand2;
            default: return -1;
        }
    }
    static int rezultat(String izraz){
        LinkedStack<Integer> stek = new LinkedStack<>();
        String operand = "";
        Integer operand1;
        Integer operand2;
        for (int i = 0; i < izraz.length(); i++) {
            if(izraz.charAt(i)>='0' && izraz.charAt(i)<='9' && izraz.charAt(i+1)==' '){
                operand+=izraz.charAt(i);
                stek.push(Integer.parseInt(operand));
                operand="";
                i+=1;
            }
            else if(izraz.charAt(i)>='0' && izraz.charAt(i)<='9'){
                operand += izraz.charAt(i);
            }
            else{
                operand1 = stek.pop();
                operand2 = stek.pop();
                stek.push(operacija(izraz.charAt(i), operand1, operand2));
                i+=1;
            }
        }
        return stek.pop();
    }

    public static void main(String[] args) {
        String izraz;
        Scanner sc = new Scanner(System.in);
        izraz = sc.nextLine();
        System.out.println(rezultat(izraz));
    }
}
