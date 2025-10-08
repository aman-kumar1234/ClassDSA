
public class Divisors {
    public static void main(String[] args) {
        int n = 36;

        System.out.print("Divisors of " + n + " are: ");

        // Step 1: print divisors from 1 to sqrt(n)
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

        // Step 2: print the paired divisors in reverse order (to keep ascending order)
        for (int i = sqrt; i >= 1; i--) {
            if (n % i == 0 && i != n / i) {
                System.out.print(n / i + " ");
            }
        }
    }
}
