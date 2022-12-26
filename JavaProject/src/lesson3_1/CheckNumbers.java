package lesson3_1;

import java.util.Scanner;
public class CheckNumbers {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter ur num");

        number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Num " + number + " Is even");
        }
        else{
            System.out.println("Num " + number + " Is odd");

        }
    }

}
