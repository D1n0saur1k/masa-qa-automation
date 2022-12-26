package lesson3_1;

import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Your Age... ");
        int age = input.nextInt();
        String whoAreYou;
 /*               if (age > 18) {
            System.out.println("U'r Adult");
        }

        else if ( age==18 ) {
            System.out.println("Idi pospi");

        }

        else {
              System.out.println("U'r too young");
*/
        whoAreYou = (age == 18) ? "ur 18" : (age > 18) ? "ur Ad" : "ur young";
        System.out.println(whoAreYou);


        }
    }
