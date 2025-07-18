import java.util.Scanner;

public class printtableofanum {
    public static void printMultiples(int n, int j) {
        for (int i = n; i <= j; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want to print the table: ");
        int n = sc.nextInt();
        System.out.println("Enter the number upto which you want to print the table: ");
        int j = sc.nextInt();
        printMultiples(n, j);
        sc.close();

    }
}
