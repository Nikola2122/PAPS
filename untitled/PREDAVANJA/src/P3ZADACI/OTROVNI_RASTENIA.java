package P3ZADACI;

import java.util.Scanner;

public class OTROVNI_RASTENIA {
    static int denovi(LinkedStack<Integer> stack){
        boolean umira = true;
        LinkedStack<Integer> stack2 = new LinkedStack<>();
        int denovi = 0;
        while(umira){
            umira = false;
            while(!stack.isEmpty()) {
                Integer element = stack.pop();
                if (stack.peek()!=null && stack.peek() >= element) {
                    stack2.push(element);
                }
                else if(stack.peek()==null){
                    break;
                }
                else{
                    umira = true;
                }
            }
            if(umira){
                while(!stack2.isEmpty()){
                    stack.push(stack2.pop());
                }
                denovi++;
            }
        }
        return denovi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedStack<Integer> stack = new LinkedStack<>();
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        System.out.println(denovi(stack));
    }
}
