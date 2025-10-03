// Q7. Write a program to solve the Tower of Hanoi problem using recursion.


class Q7 {
    static void hanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println(from + " -> " + to);
            return;
        }
        hanoi(n - 1, from, aux, to);
        System.out.println(from + " -> " + to);
        hanoi(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        hanoi(3, 'A', 'C', 'B');
    }
}
