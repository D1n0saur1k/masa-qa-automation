package lesson5.cw;
import java.util.Random;
public class CustomerArray {
    public static void main(String[] args) {
        Random random = new Random();
        double pup [] = new double [10];
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;
        double ava = 0;

        System.out.println("odd nums: ");

        for (int i = 0;i < pup.length;i++) {
            pup[i] = random.nextDouble();
            sum += pup[i];
            if (min>pup[i]){
                min = pup[i];
            }
            if (max<pup[i]){
                max = pup[i];
            }
            if (i%2 != 0){
                System.out.printf(pup[i]+" ");

            }
        }
        ava = sum/10;
        System.out.println();
        System.out.println("max v = "+ max);
        System.out.println("min v = "+ min);
        System.out.println("sum = "+ sum);
        System.out.println("average = "+ava);

    }
}
