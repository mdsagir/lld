package ds.math;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(factorial(5));// 5  5 5 5 5
    }

    static int factorial(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
