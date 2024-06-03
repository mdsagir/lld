package ds.math;

public class ReverseDigit {

    public static void main(String[] args) {

        System.out.println(reverseDigit(123));
    }

    static int reverseDigit(int num) {

        int rev = 0;
        while (num != 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num = num / 10;
        }
        return rev;
    }
}
