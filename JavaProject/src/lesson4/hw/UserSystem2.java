package lesson4.hw;
import java.util.Scanner;
public class UserSystem2 {
    public static void main(String[] args) {
        String username = "Admin";
        String password = "Password";

        System.out.println("Enter your username and password : ");

        Scanner input = new Scanner(System.in);

        String checkerU;
        String checkerP;
        int few = 0;
        int counter = 0;

        while (counter < 5 && few != 2){
            checkerU = input.next();
            checkerP = input.next();
            if (!username.equals(checkerU) || !password.equals(checkerP)){
                System.out.println("Wrong username or password, please try again");
                counter += 1;

            }
            else {
                few = 2;
                System.out.println("Hi " + username + "!");
            }
        }
    }
}