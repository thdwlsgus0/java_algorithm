package baekjoon;

import java.util.Scanner;

public class 쉬운계단수 {
	public static int MAX = 1000000000;
	public static int n;
	public static long dp[][];
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      dp = new long[101][10];
      for(int i=1; i<=9; i++) {
    	  dp[1][i]=1;
      }
      for(int i=2; i<=n; i++) {
    	  for(int j=0; j<=9; j++) {
    		  if(j==0)dp[i][j] = dp[i-1][j+1];
    		  else if(j==9)dp[i][j] = dp[i-1][j-1];
    		  else dp[i][j] = dp[i-1][j-1]+dp[i-1][j+1];
    		  dp[i][j]%=MAX;
    	  }
      }
      long sum=0;
      for(int i=0; i<=9; i++) {
    	  sum+=dp[n][i];
    	  sum%=MAX;
      }
      System.out.println(sum);
	}
}
