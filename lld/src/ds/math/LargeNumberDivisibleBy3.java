package ds.math;

public class LargeNumberDivisibleBy3 {

    public static void main(String[] args) {
        String string = "1332";
        System.out.println(isDivisibleBy3(string));
    }

    static boolean isDivisibleBy3(String number) {

        int length = number.length();
        int digitSum = 0;
        for (int i = 0; i < length; i++) {
            digitSum += Character.getNumericValue(number.charAt(i));

        }
        return digitSum % 3 == 0;
    }
}
