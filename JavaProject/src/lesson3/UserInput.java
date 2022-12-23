package lesson3;
import java.util.Locale;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {

        String name;
        int age;
        double grade;

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Enter UR Nick: ");
        name = input.nextLine();

        System.out.println("Enter UR Age: ");
        age = input.nextInt();

        System.out.println("Please Enter Ur Grade: ");
        grade = input.nextDouble();


        System.out.println("nick = "+name);
        System.out.println("age = "+age);
        System.out.println("grade = "+grade);

        System.out.println("END.");



    }
}
