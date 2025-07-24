import java.util.Scanner;

public class RemoveDuplicatesbetterr {
    static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = removeDuplicates(arr);
        System.out.println("The array after removing elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }
}