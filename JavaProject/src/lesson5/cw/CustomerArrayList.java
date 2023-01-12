package lesson5.cw;

import java.util.ArrayList;
import java.util.Random;

public class CustomerArrayList {
//    Double.MIN_VALUE
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Double> Pohuy = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            Pohuy.add(random.nextDouble());
        }

 //     Pohuy.forEach((n)->{Pohuy.add(5.0);});
        System.out.println(Pohuy);


    }
}
