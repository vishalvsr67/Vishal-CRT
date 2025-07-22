import java.util.Scanner;

public class fibonacci {
    static int fib(int N) {
        // Base condition
        if (N <= 1) {
            return N;
        }

        // Problem broken down into 2 functional calls
        // and their results combined and returned.
        return fib(N - 1) + fib(N - 2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fib(N));
        sc.close();
    }
}