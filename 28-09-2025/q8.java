// Q8. Write a program to print 1 to n using recursion.


class Q8 {
    static void print(int n) {
        if (n == 0) return;
        print(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        print(10);
    }
}
