package P3ZADACI;

import java.util.Scanner;

public class QuasiStack <E extends Comparable<E>> implements Stack<E>{
    protected DLLNode<E> top;
    protected int size;
    protected DLLNode<E> bottom;
    public QuasiStack() {
        top = null;
        bottom = null;
        size = 0;
    }
    public void clear(){
        top = null;
        bottom = null;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
    public void push(E e) {
        if(top==null){
            top = new DLLNode<>(e);
            bottom = top;
            size++;
        }
        else if(top==bottom){
            DLLNode<E> newTop = new DLLNode<>(e);
            newTop.next = top;
            bottom.prev = newTop;
            top = newTop;
            size++;
        }
        else{
            DLLNode<E> newNode = new DLLNode<>(e);
            newNode.next = top;
            top.prev=newNode;
            top = newNode;
            size++;
        }
    }
    public E peek(){
        return top.data;
    }
    public E pop() {
        if(top==null){
            return null;
        }
        else if(top==bottom){
            E tmp = top.data;
            top=bottom=null;
            size--;
            return tmp;
        }
        else{
            if(top.data.compareTo(bottom.data)>0){
                E tmp = top.data;
                top=top.next;
                size--;
                return tmp;
            }
            else{
                E tmp = bottom.data;
                bottom=bottom.prev;
                size--;
                return tmp;
            }
        }
    }
    public E peekBottom(){
        if(bottom!=null){
            return bottom.data;
        }
        else{
            return null;
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        QuasiStack<Integer> stek = new QuasiStack<>();
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            stek.push(sc.nextInt());
        }
        System.out.println(stek.peek());
        System.out.println(stek.peekBottom());
        for (int i = 0; i < n; i++) {
            System.out.println(stek.pop());
        }
    }
}
