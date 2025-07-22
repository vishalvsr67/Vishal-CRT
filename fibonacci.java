import java.util.Scanner;

public class fibonacci {
    static int fibonacci(int N) {
        // Base condition
        if (N <= 1) {
            return N;
        }

        // Problem broken down into 2 functional calls
        // and their results combined and returned.
        return fibonacci(N - 1) + fibonacci(N - 2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fibonacci(N));
        sc.close();
    }
}