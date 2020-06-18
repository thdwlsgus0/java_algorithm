package study1;

import java.util.Scanner;

public class 1로만들기 {
	public static int n, MAX = 1000001, dp[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		dp = new int[MAX+1];
		for(int i=1; i<=n; i++) {
			dp[i]=MAX;
		}
		dp[1]=0;
		for (int i = 1; i < n; i++) {
			dp[i + 1] = Math.min(dp[i + 1], dp[i] + 1);
			if (i * 2 <=n)dp[i * 2] = Math.min(dp[i * 2], dp[i] + 1);
			if (i * 3 <=n)dp[i * 3] = Math.min(dp[i * 3], dp[i] + 1);
		}
		System.out.println(dp[n]);
	}
}
