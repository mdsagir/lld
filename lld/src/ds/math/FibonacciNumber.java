package ds.math;

public class FibonacciNumber {

    public static void main(String[] args) {
        printFibonacciNumber();
        // 0 1 1 2 3 5 8 13
    }

    static void printFibonacciNumber() {

        int a = 0;
        int b = 1;

        System.out.print(" " + a + " " + b);
        for (int i = 1; i <= 10; i++) {
            int sum = a + b;
            System.out.print(" " + sum);
            a = b;
            b = sum;
        }


    }
}

