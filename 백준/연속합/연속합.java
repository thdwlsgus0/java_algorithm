package algorithm1;

import java.util.Scanner;

public class 연속합 {
	public static int n, dp[], value[];
	
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       dp = new int[n+1];
       value = new int[n+1];
       for(int i=1; i<=n; i++) {
    	   value[i] = sc.nextInt();
    	   if(dp[i-1]+value[i]>value[i]) {
    		   dp[i] = dp[i-1]+value[i];
    	   }else {
    		   dp[i] =value[i];
    	   }
       }
       int result=-1001;
       for(int i=1; i<=n; i++) {
    	   result = Math.max(result, dp[i]);
       }
       System.out.println(result);
	}
}
