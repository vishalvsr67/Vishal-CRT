import java.util.Scanner;

//This imports all classes from the package java.util, so you can 
public class cntDig2 {// brute force
    // Function to count the number
    // of digits in an integer 'n'
    public static int countDigits(int n) {

        int cnt = (int) (Math.log10(n) + 1);

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
