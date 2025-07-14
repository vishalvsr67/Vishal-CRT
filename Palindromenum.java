import java.util.Scanner;

public class Palindromenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        int original = num;
        int reversed = 0;

        while (num > 0) {
            int lastdigit = num % 10;
            reversed = (reversed * 10) + lastdigit;
            num = num / 10;

            sc.close();
        }
        if (original == reversed) {
            System.out.println(original + "is a Palindrome number");
        } else {
            System.out.println(original + "is a  NOT a Palindrome number");
        }
    }
}
