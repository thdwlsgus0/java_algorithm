package baekjoon;

import java.util.Scanner;

public class 이친수 {
	public static int n;
	public static long  dp[][];
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     n = sc.nextInt();
     // 행은 자리수를 의미 열은 0과 1의 값을 의미
     dp = new long[91][2]; 
     dp[1][1]=1;
     dp[1][0]=0;
     dp[2][0]=1;
     dp[2][1]=0;
     for(int i=3; i<=n; i++) {
    	 dp[i][1] += dp[i-1][0];
    	 dp[i][0] += dp[i-1][1] + dp[i-1][0];
     }
     System.out.println(dp[n][1]+dp[n][0]);
	}
}
