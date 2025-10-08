// Q6. Write a program to print the Fibonacci series using recursion and iteration.


class Q6 {
    static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 7, a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println();

        for (int i = 0; i < n; i++) System.out.print(fib(i) + " ");
    }
}
