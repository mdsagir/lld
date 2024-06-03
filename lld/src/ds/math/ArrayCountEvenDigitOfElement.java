package ds.math;

public class ArrayCountEvenDigitOfElement {
    public static void main(String[] args) {
        int[] arr = {122, 23, 1232, 12, 1,67};
        System.out.println(countEvenDigit(arr));
    }

    static int countEvenDigit(int[] arr) {

        int result = 0;
        for (int j : arr) {
            if (isEvenDigit(j)) {
                result++;
            }
        }
        return result;
    }

    static boolean isEvenDigit(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }

        return count % 2 == 0;
    }
}
