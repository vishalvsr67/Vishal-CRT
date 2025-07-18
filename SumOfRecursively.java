import java.util.Scanner;

public class SumOfRecursively {

    static int sum(int n) {
        // base case
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sum(n));
        sc.close();
    }
}
