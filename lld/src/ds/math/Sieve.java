package ds.math;

public class Sieve {
    public static void main(String[] args) {
        int i = 40;
        boolean[] booleans = new boolean[i + 1];
        test(i, booleans);
    }

    static void test(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {

            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }
            for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    static void sieve(int n, boolean[] primes) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[i] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {

        }


    }
}
