package P3ZADACI.QUEUES;

import java.util.Scanner;

class Process{
    String ime;
    int izvrsuvanje;
    int pristignuvanje;
    public Process(String ime, int izvrsuvanje, int pristignuvanje) {
        this.ime = ime;
        this.izvrsuvanje = izvrsuvanje;
        this.pristignuvanje = pristignuvanje;
    }
    @Override
    public String toString() {
        return ime;
    }
}
public class ROUND_ROBIN {
    static void swap(Process a, Process b) {
        Process temp = a;
        a = b;
        b = temp;
    }
    static void bubble(Process[] procesi, int n){
        boolean swapped=true;
        while(swapped){
            swapped=false;
            for (int i = 0; i < n-1; i++) {
                if(procesi[i].pristignuvanje>procesi[i+1].pristignuvanje){
                    Process temp = procesi[i];
                    procesi[i] = procesi[i + 1];
                    procesi[i + 1] = temp;
                    swapped = true;
                }
            }
        }
    }
    static LinkedQueue<Process> raspored (Process[] procesi, int n,int kvantum){
        LinkedQueue<Process> raspored = new LinkedQueue<Process>();
        bubble(procesi,n);
        for (int i = 0; i < n; i++) {
            raspored.enqueue(procesi[i]);
        }
        int i = 0;
        int tmpn=n;
        while(n>0){
            Process curr = procesi[i];
            if(curr!=null) {
                int ostanatoVreme = curr.izvrsuvanje - kvantum;
                if (ostanatoVreme > 0) {
                    curr.izvrsuvanje = ostanatoVreme;
                    raspored.enqueue(curr);
                    procesi[i] = curr;
                } else {
                    procesi[i] = null;
                    n--;
                }
            }
            i++;
            if(i==tmpn){
                i=0;
            }
        }
        return raspored;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Process[] procesi = new Process[10];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            procesi[i] = new Process(sc.next(), sc.nextInt(), sc.nextInt());
        }
        int kvantum = sc.nextInt();
        LinkedQueue<Process> raspored = raspored(procesi,n,kvantum);
        System.out.println(raspored);
    }
}
