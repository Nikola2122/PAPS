package P1ZADACI;

import java.util.Arrays;

public class P1 {
    public static class Main {
        // suma na x na kvadrat
        static int suma(int x, int n){
            int suma = 0;
            for (int i = 1; i <= n; i++) {
                suma+= (int) Math.pow(x, i);
            }
            return suma;
        }
        // suma na i na treta
        static int suma2(int n){
            int suma = 0;
            for (int i = 1; i <= n; i++) {
                suma+=i*i*i;
            }
            return suma;
        }
        // najgolema suma na podniza
        static int [] suma3(int [] a,int n){
            int max = 0;
            int start=-1;
            int end=-1;
            for (int i = 0; i < n; i++) {
                int currSum=0;
                for (int j = i; j < n; j++) {
                    currSum+=a[j];
                    if(currSum>max){
                        max=currSum;
                        start=i;
                        end=j;
                    }
                }
            }
            return new int[]{start,end,max};
        }
        public static void main(String[] args) {
            int suma = suma(3,3);
            System.out.println(suma);
            System.out.println(suma2(3));
            int []a = {-2,11,-4,13,-5,-2};
            System.out.println(Arrays.toString(suma3(a,6)));
        }
    }
}
