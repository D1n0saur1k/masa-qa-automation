package lesson3_1;

public class Ternary {
    public static void main(String[] args) {

        int a = 5;
        int b = 5;
        int c = 6;
        String result;

        if (a == b){
            result = "a & b are equal";
        }
        else {
            result = "a & b aren't equal";
        }
//        result = (a == b) ? "a & b are equal" : "a & b aren't equal";

        System.out.println("result = " + result);
    }

}
