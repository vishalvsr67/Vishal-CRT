import java.util.Arrays;
import java.util.Scanner;

public class checkifarrsortedbetter {
    public static boolean isSorted(int arr[], int n) {
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        // int[] temp =
        Arrays.sort(temp);
        return Arrays.equals(arr, temp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        if (isSorted(arr, n)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
