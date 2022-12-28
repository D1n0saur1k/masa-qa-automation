package lesson3_1.hw;
import java.util.Scanner;
public class UserSystem {
    public static void main(String[] args) {
        String username = "Admin";
        String password = "P@ssword";

        System.out.println("Enter your username: ");

        Scanner input = new Scanner(System.in);

        String checker;
        do {
           checker = input.next();
            if (!username.equals(checker)) {
                System.out.println("Wrong username, please try again ");
            }
        } while (!username.equals(checker));
        System.out.println("Enter your password");
        do {
            checker = input.next();
            if (!password.equals(checker)) {
                System.out.println("Wrong password, please try again ");
            }
        } while (!password.equals(checker));
        System.out.println("Hi " + username + " U're In");
        input.close();
    }
}












