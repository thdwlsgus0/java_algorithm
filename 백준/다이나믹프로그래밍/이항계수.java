package baekjoon;

import java.util.Scanner;

public class 이항계수2{
	public static int MAX = 10007;
	public static int n,k;
	public static int dp[][];
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      k = sc.nextInt();
      dp = new int[n+1][n+1];
      dp[0][0]=1;
      dp[1][0]=1;
      dp[1][1]=1;
      for(int i=2; i<=n; i++) {
    	  for(int j=0; j<=i; j++) {
    		  if(j==0)dp[i][j] = 1;
    		  else if(j==i)dp[i][j] = 1;
    		  else dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
    		  dp[i][j] %=MAX;
    	  }
      }
      System.out.println(dp[n][k]%MAX);
	}
}
