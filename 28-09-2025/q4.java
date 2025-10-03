// Q4. Write a program to find the maximum and minimum element in an array.

class Q4 {
    public static void main(String[] args) {
        int[] arr = {10, 3, 45, 2, 9};
        int max = arr[0], min = arr[0];

        for (int x : arr) {
            if (x > max) max = x;
            if (x < min) min = x;
        }

        System.out.println("Max = " + max + ", Min = " + min);
    }
}
