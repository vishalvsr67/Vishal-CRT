import java.util.Scanner;

public class Euclidian_algorithm {
    public static int findEuclidian(int N1, int N2) {
        while (N1 > 0 && N2 > 0) {
            if (N1 > N2) {
                N1 = N1 % N2;
            } else if (N2 > N1) {
                N2 = N2 % N1;
            }
        }
        return N1 == 0 ? N2 : N1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N1: ");
        int N1 = sc.nextInt();
        System.out.println("Enter the value of N2: ");
        int N2 = sc.nextInt();
        int result = findEuclidian(N1, N2);
        System.out.println("The Gcd of two numbers N1 and N2 is: " + result);
        sc.close();

    }
}
