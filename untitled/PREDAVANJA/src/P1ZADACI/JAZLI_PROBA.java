package P1ZADACI;

import java.util.Iterator;

class SLLNode<E>{
    protected E data;
    protected SLLNode<E> next;

    public SLLNode(E data){
        this.data = data;
        this.next = null;
    }
    public SLLNode(E data, SLLNode<E> next) {
        this.data = data;
        this.next = next;
    }
    @Override
    public String toString(){
        return data.toString();
    }
}
class SLL<E>{
    protected SLLNode<E> first;

    public SLL(SLLNode<E> node){
        first = node;
    }
    public SLL(){
        first = null;
    }
    public void insertFirst(SLLNode<E> node){
        node.next = first;
        first = node;
    }
    public void insertFirst(E node){
        SLLNode<E> ins = new SLLNode<E>(node, null);
        ins.next = first;
        first = ins;
    }
    public void remove(E node){
        SLLNode<E> tmp = first;
        if(node == tmp.data){
            first = first.next;
        }else {
            while (tmp.next.data != node) {
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
        }
    }
    void remove(SLLNode<E> node){
        SLLNode<E> tmp = first;
        if(node == tmp){
            first = first.next;
        }else {
            while (tmp.next != node) {
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
        }
    }
    public void insertLast(SLLNode<E> node){
        if(first==null){
            insertFirst(node);
        }
        else {
            SLLNode<E> tmp = first;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = node;
        }
    }
    public void insertLast(E node){
        if(first==null){
            insertFirst(node);
        }
        else {
            SLLNode<E> tmp = first;
            SLLNode<E> ins = new SLLNode<E>(node, null);
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = ins;
        }
    }
    public void insertBefore(E data, E node){
        SLLNode<E> nov = new SLLNode<E>(node, null);
        SLLNode<E> tmp = first;
        while(tmp.next.data != data){
            tmp = tmp.next;
        }
        nov.next = tmp.next;
        tmp.next = nov;
    }
    public void replace(E data, E node){
        SLLNode<E> nov = new SLLNode<E>(node);
        SLLNode<E> tmp = first;
        if(tmp.data.equals(data)){
            nov.next = first.next;
            first = nov;
        }else {
            while (!tmp.next.data.equals(data)) {
                tmp = tmp.next;
            }
            nov.next = tmp.next.next;
            tmp.next = nov;
        }
    }
    public void insertAfter(E data,SLLNode<E> node){
        SLLNode<E> tmp = first;
        while(tmp!=null && !tmp.data.equals(data)){
            tmp = tmp.next;
        }
        if(tmp==null){
            return;
        }
        node.next = tmp.next;
        tmp.next = node;
    }
    public void insertAfter(SLLNode<E> after, E node){
        SLLNode<E> nov = new SLLNode<E>(node,after.next);
        after.next = nov;
    }
    @Override
    public String toString(){
        SLLNode<E> tmp = first;
        String ret = "";
        ret+=tmp;
        while(tmp.next!=null){
            tmp = tmp.next;
            ret += "->" + tmp;
        }
        return ret;
    }
}
public class JAZLI_PROBA {
    public static void main(String[] args) {
        SLLNode<Integer> novPrv= new SLLNode<Integer>(100,null);
        SLLNode<Integer> posleden = new SLLNode<Integer>(200,null);
        SLLNode<Integer> after = new SLLNode<Integer>(300,null);
        SLLNode<Integer> after2 = new SLLNode<Integer>(32,null);
        SLL<Integer> niza = new SLL<Integer>();

        niza.insertFirst(1);
        niza.insertFirst(2);
        niza.insertFirst(novPrv);
        niza.insertFirst(120);
        niza.insertLast(posleden);
        niza.insertAfter(2,after);
        niza.insertBefore(2,15);
        niza.insertAfter(300,after2);
        niza.remove(120);
        niza.remove(15);
        niza.replace(32,155);
        niza.replace(2,200);
        niza.insertAfter(novPrv,112);
        System.out.println(niza);

    }
}
