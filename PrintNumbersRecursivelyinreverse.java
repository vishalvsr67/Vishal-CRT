
import java.util.Scanner;

public class PrintNumbersRecursivelyinreverse {

    static void printNumbers(int current, int n) {
        if (current > n) {
            return;
        }

        printNumbers(current + 1, n);
        System.out.print(current + " ");

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