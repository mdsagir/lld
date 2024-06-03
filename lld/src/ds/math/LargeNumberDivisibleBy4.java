package ds.math;

public class LargeNumberDivisibleBy4 {
    public static void main(String[] args) {

        System.out.println(isNumberDivisibleBy4("12312312"));
    }

    static boolean isNumberDivisibleBy4(String number) {
        int length = number.length();
        if (length == 0) {
            return false;
        }
        if (length == 1) {
            return (number.charAt(0) / 4 == 0);
        }

        int last = number.charAt(length - 1) - '0';
        int secondLast = number.charAt(length - 2) - '0';
        return (secondLast * 10 + last) % 4 == 0;

    }
}
