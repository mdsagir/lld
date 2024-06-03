package ds.math;

public class ArmstrongNumber {
    public static void main(String[] args) {

        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(1634));
        System.out.println(isArmstrongNumber(134));

        System.out.println(PowMod(2, 6, 10));


    }

    static boolean isArmstrongNumber(int n) {

        int temp = n;

        int result = 0;
        int noOfDigit = getNoOfDigit(n);
        while (n != 0) {
            int lastDigit = n % 10;
            result += pow(lastDigit, noOfDigit);
            n = n / 10;
        }
        return temp == result;
    }

    static int getNoOfDigit(int n) {
        int digit = 0;
        while (n != 0) {
            n = n / 10;
            digit++;
        }
        return digit;
    }

    static int pow(int num, int pow) {
        int result = 1;
        for (int i = 0; i < pow; i++) {
            result = result * num;
        }
        return result;
    }

    static long PowMod(long x, long n, long m) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result = result * x;
        }
        return result % m;
    }
}
