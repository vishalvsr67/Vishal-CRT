import java.util.Scanner;

public class PrintNumbersRecursively {

    static void printNumbers(int current, int n) {
        if (current > n) {
            return;
        }

        System.out.print(current + " ");
        printNumbers(current + 1, n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number n: ");
        int n = sc.nextInt();

        System.out.print("Numbers from 0 to " + n + ":");
        printNumbers(0, n);
        sc.close();
    }
}
