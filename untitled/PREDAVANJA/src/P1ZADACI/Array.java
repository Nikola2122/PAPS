package P1ZADACI;

public class Array<E>{
    private E[] array;
    private int size;
    private int capacity;

    public Array(int capacity){
        this.array = null;
        this.capacity = capacity;
        this.size = 0;
    }
    public Array(E[] array,int capacity){
        this.array = (E[]) new Object[capacity];
        this.capacity = capacity;
        this.size = array.length;
        for (int i = 0; i < size; i++) {
            this.array[i] = array[i];
        }
    }
    E get(int index){
        return array[index];
    }
    E [] getArray(){
        return this.array;
    }
    int getCapacity(){
        return this.capacity;
    }
    int getSize(){
        return this.size;
    }
    void add(E e){
        if(size == capacity ){
            return;
        }else{
            array[size++] = e;
        }
    }
    void remove(int index){
        if(size == 0){
            return;
        }
        else{
            if(index == size-1){
                size--;
                array[size] = null;
            }
            else{
                for (int i = index; i < size; i++) {
                    if(i==size-1){
                        array[size-1] = null;
                        break;
                    }
                    array[i] = array[i+1];
                }
                size--;
            }
        }
    }
    void changeTwoArrays(Array<E> array1){
        for (int i = 0; i < size; i++) {
            if(array[i]==array1.get(i)){
                remove(i);
                array1.remove(i);
            }
        }
    }
    public String toString(){
        String niza = "";
        for (int i = 0; i < size; i++) {
            if(i==size-1){
                niza+=array[i];
            }else {
                niza += array[i] + ", ";
            }
        }
        return niza;
    }
}
