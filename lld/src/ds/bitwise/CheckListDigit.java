package ds.bitwise;

public class CheckListDigit {
    public static void main(String[] args) {

        checkLastDigit(5, 1 );
    }

    static void checkOddEven(int n) {
        if ((n & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }

    // at given no find the length of digit are exist or not
    static void checkLastDigit(int n, int k) {

        int kth = n >> k - 1;
        if ((kth & 1) == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
