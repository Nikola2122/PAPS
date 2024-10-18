package P1ZADACI;

public class NIZI {
    static int brojNajblizokDoProsek(int []a){
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma+=a[i];
        }
        float prosek = (float)suma/a.length;
        int najblizok = 0;
        float tempRazlika = 0;
        float razlika = 0;
        for (int i = 0; i < a.length; i++) {
            if(i==0){
                najblizok=a[i];
                razlika = Math.abs(prosek - a[i]);
            }else{
                tempRazlika = Math.abs(prosek - a[i]);
                if(tempRazlika < razlika){
                    razlika = tempRazlika;
                    najblizok = a[i];
                }
            }
        }
        return najblizok;
    }
    public static void main(String[] args) {
        int []niza = {1,4,5,10,22,15};
        System.out.println(brojNajblizokDoProsek(niza));

        Integer []niza1 = {1,4,5,10,22,15};
        Integer []niza2 = {1,2,5,3,22,10};
        Array<Integer> arr = new Array<>(niza1,6);
        Array<Integer> arr1 = new Array<>(niza2,6);
//        for (int i = 0; i < arr.getSize(); i++) {
//            if(arr.get(i)==arr1.get(i)){
//                arr.remove(i);
//                arr1.remove(i);
//            }
//        }
        arr.changeTwoArrays(arr1);
        System.out.println(arr);
        System.out.println(arr1.toString());
        Array<Integer> arr2 = new Array<>(niza2,6);
        arr2.remove(2);
        System.out.println(arr2.toString());
    }
}
