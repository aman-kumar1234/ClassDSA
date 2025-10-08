
public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 4, 5, 6};
        int target = 6;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                break; // no need to check further
            }
        }

        System.out.println("Target present: " + found);
    }
}

}
