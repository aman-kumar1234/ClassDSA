// Q9. Write a program to print the sum of the first n natural numbers using recursion.

class Q9 {
    public static void main(String[] args) {
        int n = 10, s = 0;

        for (int i = 1; i <= n; i++) s += i;

        System.out.println("Sum = " + s);
    }
}
