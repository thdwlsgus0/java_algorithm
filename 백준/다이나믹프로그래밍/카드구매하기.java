package baekjoon;

import java.util.Scanner;

public class 카드구매하기 {
	public static int n,dp[];
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     n = sc.nextInt();
     dp = new int[n+1];
     for(int i=1; i<=n; i++) dp[i]= sc.nextInt();
     for(int i=2; i<=n; i++)
    	 for(int j=1; j<=i; j++) 
    		 dp[i] = Math.max(dp[i], dp[j]+dp[i-j]);
     System.out.println(dp[n]);
	}
}
