import java.util.Scanner;

public class Largestoddnuminstring {
    public String largestOddNumber(String num) {
        int i = num.length() - 1;
        while (i >= 0 && (num.charAt(i) - '0') % 2 == 0) {
            i--;
        }
        return num.substring(0, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string number: ");
        String num = sc.nextLine();
        Largestoddnuminstring sol = new Largestoddnuminstring();
        String result = sol.largestOddNumber(num); // <-- Store the result
        System.out.println("Largest odd number substring: " + result);
        sc.close();

    }
}
