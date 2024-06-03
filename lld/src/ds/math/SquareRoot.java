package ds.math;

public class SquareRoot {
    public static void main(String[] args) {

        System.out.println(decimalSquareRoot(63));
    }


    static int binarySearchSquareRoot(int num) {

        int start = 1;
        int end = num;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == num) {
                return mid;
            }
            if (mid * mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static double decimalSquareRoot(int num) {
        double incr = 0.1;
        int p = 3;
        double root = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= num) {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }

    static int squareRoot(int num) {

        int result = -1;
        for (int i = 2; i < num; i++) {
            if (i * i == num) {
                result = i;
            }
        }
        return result;
    }
}
