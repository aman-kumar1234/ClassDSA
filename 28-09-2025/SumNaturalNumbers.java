// Q9. Write a program to print the sum of the first n natural numbers using recursion.

import java.util.Scanner;

public class SumNaturalNumbers {
    
    // Recursive function to find sum
    static int sum(int n) {
        if (n == 0)   // Base condition
            return 0;
        else
            return n + sum(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int result = sum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
        
        sc.close();
    }
}
