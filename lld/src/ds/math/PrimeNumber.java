package ds.math;

import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {
        int i1 = 11;
        int i2 = 4;
        System.out.println(isPrimeNumber3(i1));
        System.out.println(isPrimeNumber3(i2));
        System.out.println(Math.sqrt(i1));
        printPrimeNumber4(i1);
    }

    static boolean isPrimeNumber1(int n) {

        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isPrimeNumber2(int n) {

        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isPrimeNumber3(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isPrimeNumber4(int n) {
        if (n <= 1) {
            return false;
        }

        return IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .noneMatch(value -> n % value == 0);
    }

    static void printPrimeNumber4(int n) {


        IntStream.rangeClosed(2, n)
                .forEach(value -> {
                    if (isPrimeNumber4(value)) {
                        System.out.print(value + " ");
                    }
                });
    }


}
