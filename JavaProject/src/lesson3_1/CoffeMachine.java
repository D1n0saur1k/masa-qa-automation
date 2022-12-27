package lesson3_1;
import java.util.Scanner;
public class CoffeMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int finalBalance;
        System.out.println("Your Money: ");
        int balance = input.nextInt();
        if (balance > 0) {
            System.out.println("1 - Coffe - 5₪");
            System.out.println("2 - Tea - 3₪");
            System.out.println("3 - Hot Choko - 4₪");
            System.out.println("4 - Water - 2₪");
            System.out.println("Pick drink: 1-4");

            String drink = input.next();
            switch (drink){
                case "1":
                    if (balance >= 5){
                        finalBalance = balance - 5;
                        System.out.println("Your change is " + finalBalance);
                    }
                    else {
                        System.out.println("You don't have enough money");
                    }
                    break;
                case "2":
                    if (balance >= 3){ finalBalance = balance - 3;
                        System.out.println("Your change is " + finalBalance);}
                    else {
                        System.out.println("You don't have enough money");}
                    break;
                case "3":
                    if (balance >= 4){ finalBalance = balance - 4;
                        System.out.println("Your change is " + finalBalance);}
                    else {
                        System.out.println("You don't have enough money");}
                    break;
                case "4":
                    if (balance >= 2){ finalBalance = balance - 2;
                        System.out.println("Your change is " + finalBalance);}
                    else {
                        System.out.println("You don't have enough money");}
                    break;
                default:
                    System.out.println("Wrong num");
                    break;
            }
            input.close();

        }
        else if (balance == 0){
            System.out.println("Your balance is 0");

        }
        else {
            System.out.println("Your balance is negative");
        }


    }
}
