package P3ZADACI;

import java.util.EmptyStackException;

public class ArrayStack <E> implements Stack<E> {
    protected E[] stack;
    protected int depth;
    public ArrayStack(int maxDepth) {
        stack = (E[]) new Object[maxDepth];
        depth = 0;
    }
    public boolean isEmpty() {
        return depth == 0;
    }
    public void push(E e) {
        if(depth<stack.length) {
            stack[depth++] = e;
        }
        else{
            throw new StackOverflowError();
        }
    }
    public E peek(){
        return stack[depth-1];
    }
    public E pop(){
        if(depth!=0) {
            E e = stack[--depth];
            stack[depth] = null;
            return e;
        }
        else{
            throw new EmptyStackException();
        }
    }
    public int size(){
        return depth;
    }
    public void clear(){
        for (int i = 0; i < depth; i++) {
            stack[i] = null;
        }
        depth = 0;
    }
}
