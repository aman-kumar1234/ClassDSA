// Q1. Write a program to insert and delete a new element at a specified position in an array.

import java.util.*;

class InsertDelete{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        int n = 5;

        for (int i = 0; i < n; i++) arr[i] = i + 1;
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
        System.out.println();

        int pos = 2, val = 99;
        for (int i = n; i > pos; i--) arr[i] = arr[i - 1];
        arr[pos] = val;
        n++;

        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
        System.out.println();

        pos = 3;
        for (int i = pos; i < n - 1; i++) arr[i] = arr[i + 1];
        n--;

        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
}


