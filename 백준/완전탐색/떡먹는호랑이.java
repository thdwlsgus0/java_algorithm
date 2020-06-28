import java.util.Scanner;

public class 떡먹는호랑이 {
	public static int D,K;
	public static long dp[];
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      D = sc.nextInt();
      K = sc.nextInt();
      dp = new long[31];
      for(int i=1; i<=50000; i++) {
    	  for(int j=i; j<=50000; j++) {
    		  dp[1]=i;
    		  dp[2]=j;
    		  for(int k=3; k<=D; k++) {
    			  dp[k] = dp[k-1]+dp[k-2];
    		  }
    		  if(dp[D] == K) {
    			  System.out.println(i);
    			  System.out.println(j);
    			  return;
    		  }
    	  }
       }
	}
}
