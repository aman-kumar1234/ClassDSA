// Q5. Write a program to find the factorial of a number using recursion and iteration.

class Q5 {
    static int factRec(int n) {
        if (n == 0) return 1;
        return n * factRec(n - 1);
    }

    public static void main(String[] args) {
        int n = 5, f = 1;

        for (int i = 1; i <= n; i++) f *= i;
        System.out.println("Iterative = " + f);

        System.out.println("Recursive = " + factRec(n));
    }
}
