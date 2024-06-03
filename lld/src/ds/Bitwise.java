package ds;

public class Bitwise {
    public static void main(String[] args) {

//        System.out.println(isOdd(11));
//        int[] arr = {1, 1, 22, 22, 4};
//        System.out.println(unique(arr));
//        System.out.println(Math.pow(12, 0));
        System.out.println(~ -5);
    }

    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    static int unique(int[] arr) {
        int result = 0;
        for (int n : arr) {
            result = result ^ n;
        }
        return result;
    }
}
