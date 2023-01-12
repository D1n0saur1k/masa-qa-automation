package lesson5.hw;
import java.sql.Array;
import java.util.Scanner;
public class AreArraysEqual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter lenght of array a:");
        int a = input.nextInt();

        System.out.println("Enter lenght of array b:");
        int b = input.nextInt();

        int pis[] = new int[a];
        int pop[] = new int[b];

        for (int i = 0; i < a; i++) {
            System.out.println("Enter "+ (i+1) +" number of array a:");
            pis[i]=input.nextInt();
        }
        for (int i = 0; i < b; i++) {
            System.out.println("Enter "+ (i+1) +" number of array b:");
            pop[i]=input.nextInt();
        }
        boolean otvet = ArrayE(pis,  pop);
        System.out.println(otvet);
    }
    public static boolean ArrayE (int pis[], int pop[]) {
        if (pis.length == pop.length) {
            for (int i = 0; i < pis.length; i++) {
                if (pis[i]==pop[i]){

                }
                else{
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
