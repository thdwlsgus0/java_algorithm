package baekjoon;

import java.util.Scanner;

public class 제곱수의합 {
	public static int n, dp[];
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     n = sc.nextInt();
     dp = new int[n+1];
     dp[0]=1;
     dp[1]=1;
     for(int i=2; i<=n; i++) {
    	 dp[i]=9999999;
    	 int sqrt_value = (int)Math.sqrt(i);
    	 if(i == sqrt_value * sqrt_value)
    		 {
    		   dp[i]=1;
    		    continue;
    		 }
    	 for(int j=sqrt_value; j>=1; j--) {
    		 int square_value = j*j;
    		 dp[i]=Math.min(dp[i], dp[square_value] + dp[i-square_value]);
    	 }
     }
    System.out.println(dp[n]);
	}
}
