import java.util.Scanner;

public class 직사각형을 만드는 방법{
	public static int dp[], n;
	public static int prime_check(int n) {
		int cnt=0;
		for(int i=1; i<=(int)Math.sqrt(n); i++) {
			if(n%i==0)cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      dp = new int[n+1];
      for(int i=1; i<=n; i++) {
    	  dp[i] = dp[i-1]+prime_check(i);
      }
      System.out.println(dp[n]);
	}
}
