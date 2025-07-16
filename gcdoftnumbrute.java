import java.util.*;

public class gcdoftnum {
    public static int calculateGcd(int x, int y) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(x, y); i++) {
            if (x % i == 0 && y % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = calculateGcd(x, y);
        sc.close();
        System.out.println("The gcd of the two numbers is :" + result);
    }
}
