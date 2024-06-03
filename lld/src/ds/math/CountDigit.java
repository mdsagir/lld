package ds.math;

public class CountDigit {

    public static void main(String[] args) {

        System.out.println(countDigit(123));
    }

    static int countDigit(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
