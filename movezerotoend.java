import java.util.*;

public class movezerotoend {

    static void endingZeros(int[] arr, int k, int n) {
        ArrayList<Integer> temp = new ArrayList<>();

        // Add all non-zero elements to the temp list
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        // Copy non-zero elements back to original array
        for (int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }

        // Fill remaining positions with 0
        for (int i = n - k; i < n; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Count the number of zeros
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                k++;
            }
        }

        // Call function
        endingZeros(arr, k, n);

        // Print updated array
        System.out.println("Array after moving zeros to end:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
