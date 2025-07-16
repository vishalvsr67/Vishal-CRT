import java.util.Scanner;

//This imports all classes from the package java.util, so you can 
public class cntDig1 {// brute force
    // Function to count the number
    // of digits in an integer 'n'
    public static int countDigits(int n) {
        // Initialize a counter variable
        // 'cnt' to store the count of digits.
        int cnt = 0;
        // while loop iterates until 'n'
        // becomes 0 (no more digits left).
        while (n > 0) {
            // Increment the counter
            // for each digit encountered.
            cnt = cnt + 1;
            // Digit 'n' by 10 to
            // remove the last digit.
            n = n / 10;
        }
        // Return the
        // Count of digits.
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("N: " + N);
        int digits = countDigits(N);
        System.out.println("Number of Digits in N:" + digits);
        sc.close();
    }
}
