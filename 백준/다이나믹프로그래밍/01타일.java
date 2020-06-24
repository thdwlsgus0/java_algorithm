package baekjoon;

import java.util.Scanner;

public class 타일 {
	public static int n;
	public static long dp[];
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     n = sc.nextInt();
     dp = new long[1000001];
     dp[1]=1;
     dp[2]=2;
     for(int i=3; i<=n; i++) {
    	 dp[i] = dp[i-1]+dp[i-2];
    	 dp[i]%=15746;
     }
     System.out.println(dp[n]);
	}
}
