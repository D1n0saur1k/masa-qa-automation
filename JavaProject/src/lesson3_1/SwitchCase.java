package lesson3_1;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter num 1-3");

        String text = input.nextLine();

        switch (text){
            case "1":
                System.out.println("Num is 1");
                break;
            case "2":
                System.out.println("Num is 2");
                break;
            case "3":
                System.out.println("Num is 3");
                break;
            default:
                System.out.println("Wrong num");
                break;
        }
        input.close();
    }
}
