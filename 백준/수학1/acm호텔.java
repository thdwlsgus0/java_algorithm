package algorithm1;

import java.util.Scanner;

public class acm호텔 {
	public static int n;
	public static void main(String[] args) {
     
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int i=0; i<n; i++) {
    	  int H,W,N;
    	  int cnt=0;
    	  H= sc.nextInt();
    	  W= sc.nextInt();
    	  N= sc.nextInt();
    	  for(int j=1; j<=W; j++) {
    		  int result = j;
    		  for(int k=1; k<=H; k++) {
    			  result+=100;
    			  cnt++;
    			  if(cnt == N)
    			  {
    				  System.out.println(result);
    				  break;
    			  }
    		  }
    		  if(cnt == N)
			  {
				  break;
			  }
    	  }
      }
	}
}
