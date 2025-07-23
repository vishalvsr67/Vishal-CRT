import java.util.*;

public class RemoveDuplicates {
    static int removeDuplicates(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x : set) {
            arr[j++] = x;
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = removeDuplicates(arr, n);
        System.out.println("The array after removing elements is ");
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i] + " ");
        }
        sc.close();

    }
}
