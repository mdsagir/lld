package ds.math;

public class CountDivisorByN {
    public static void main(String[] args) {

        //System.out.println(count2(18));
        System.out.println(Math.sqrt(36));
    }

    static int count(int n) {

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    static int count2(int n) {

        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {

                if (n / i == 0) {
                    count++;
                } else {
                    count = count + 2;
                }
            }
        }
        return count;
    }
}
