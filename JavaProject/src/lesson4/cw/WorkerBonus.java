package lesson4.cw;
import java.util.Scanner;
public class WorkerBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your current salary");
        double salary = input.nextInt();
        System.out.println("Enter your work experience");
        double xp = input.nextInt();
        double bonus;

        if (xp < 5 && xp > 0 ){
            bonus = salary * 0.1;
        }
        else if (10 > xp) {
            bonus = salary * 0.15;
        }
        else if (15 > xp) {
            bonus = salary * 0.25;
        }
        else if (20 > xp) {
            bonus = salary * 0.35;
        }
        else if (25 > xp) {
            bonus = salary * 0.45;
        }
        else  {
            bonus = salary * 0.5;
        }
        input.close();

        System.out.println("Your bonus is " + bonus);
        System.out.println("Your new salary is " + (bonus + salary));
    }
}
