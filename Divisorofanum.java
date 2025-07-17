import java.util.Scanner;

public class Divisorofanum {
    public static void findDivisors(int N) {
        System.out.println("Divisors of" + N + "are: ");
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.print(i + " ");

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want all the divisors of it to be printed: ");
        int N = sc.nextInt();
        findDivisors(N);
        sc.close();

    }
}
