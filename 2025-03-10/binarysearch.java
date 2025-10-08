public class PracticeProblem2 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,3,3,4,4,4,5,5,6,6,6,7,7,7};
        int target = 2;

        int first = findFirst(arr, target);
        int last = findLast(arr, target);

        if (first == -1)
            System.out.println("Target not found");
        else
            System.out.println("First occurrence: " + first + ", Last occurrence: " + last);
    }

    // Find first occurrence
    static int findFirst(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                result = mid;
                high = mid - 1; // continue searching left
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    // Find last occurrence
    static int findLast(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                result = mid;
                low = mid + 1; // continue searching right
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}
