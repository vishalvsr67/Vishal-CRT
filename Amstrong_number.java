import java.lang.Math;
import java.util.Scanner;

public class Amstrong_number {
    public static boolean isArmstrong(int num) {
        int original = num;
        int digits = (int) (Math.log10(num)) + 1;
        int sum = 0;

        while (num > 0) {
            int ld = num % 10; // last digit
            sum += Math.pow(ld, digits);
            num /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int num = sc.nextInt();
        sc.close();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number ");
        } else {
            System.out.println(num + " is not an Armstrong number ");
        }
    }
}