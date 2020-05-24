package algorithm;

import java.util.Scanner;

public class 11727 {
	public static int [] dp;
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       dp = new int[1001];
       dp[1] = 1;
       dp[2] = 3;
       for(int i=3; i<=n; i++) {
    	   dp[i] = dp[i-1] + 2*dp[i-2];
    	   dp[i]%=10007;
       }
       System.out.println(dp[n]);
	}
}
