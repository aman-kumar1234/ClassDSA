import java.util.ArrayList;

public class FindDivisors {
    public static void main(String[] args) {
        int n = 36;  // Example number
        ArrayList<Integer> divisors = new ArrayList<>();

        // Loop from 1 to sqrt(n) for efficiency
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i); // i is a divisor
                if (i != n / i) { // Avoid adding square root twice
                    divisors.add(n / i);
                }
            }
        }

        // Optional: sort the divisors
        divisors.sort(null);

        System.out.println("Divisors of " + n + " are: " + divisors);
    }
}
