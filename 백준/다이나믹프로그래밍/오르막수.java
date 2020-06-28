package baekjoon;

import java.util.Scanner;

public class 오르막수 {
	public static int n, dp[][];
	public static int MAX = 10007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp = new int[1001][10];
        for(int i=0; i<=9; i++) {
        	dp[1][i] = 1;
        }
        for(int i=2; i<=n; i++) {
        	for(int j=0; j<=9; j++) {
        		for(int k=0; k<=j; k++) {
        			dp[i][j] +=dp[i-1][k];
        			dp[i][j] %= MAX;
        		}
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
