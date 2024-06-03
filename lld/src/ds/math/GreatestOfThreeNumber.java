package ds.math;

public class GreatestOfThreeNumber {
    public static void main(String[] args) {

        System.out.println(result(1, 2, 3));
        System.out.println(result(1, 3, 2));
        System.out.println(result(3, 1, 2));
    }

    static int result(int n1, int n2, int n3) {


        if (n1 >= n2 && n1 >= n3) {
            return n1;
        } else if (n2 >= n1 && n2 >= n3) {
            return n2;
        } else {
            return n3;
        }
    }
}
