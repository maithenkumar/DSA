package questions;


import java.util.Scanner;

public class ademo {
 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int result = countDistinctStrings(s);
        System.out.println(result);
    }

    static int countDistinctStrings(String s) {
        int n = s.length();
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            if (s.charAt(i - 1) != s.charAt(i - 2)) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1];
            }
            dp[i] %= 1000000007;
        }
        return (int) dp[n];
    
   
    }
}