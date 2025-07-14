import java.util.Scanner;

class Solution {
    public int reverse(int x) {
        int revnum = 0;
        while (x != 0) {
            int lastdigit = x % 10;
            if (revnum > Integer.MAX_VALUE / 10 || (revnum == Integer.MAX_VALUE / 10 && lastdigit > 7))
                return 0;
            if (revnum < Integer.MIN_VALUE / 10 || (revnum == Integer.MIN_VALUE / 10 && lastdigit < -8))
                return 0;
            revnum = (revnum * 10) + lastdigit;
            x = x / 10;
        }
        return revnum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        Solution sol = new Solution();
        int result = sol.reverse(x);
        System.out.println("Reversed number is:" + result);
    }
}