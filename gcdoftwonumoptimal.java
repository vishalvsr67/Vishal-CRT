import java.util.*;

public class gcdoftwonumoptimal {
    public static int calculateGcd(int x, int y) {

        for (int i = Math.min(x, y); i > 1; i--) {
            if (x % i == 0 && y % i == 0) {
                return i;
            }
        }
        return 1;
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
