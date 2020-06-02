package algorithm;

import java.util.Scanner;

public class 벌집 {
	public static int n;
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      if(n==1) {
    	  System.out.println(1);
    	  return;
      }
      int value=2, step=1, cnt=1;
      while(n!=value) {
    	
    	  if(cnt== step*6) {
    		  step++;
    		  cnt=1;
    		  value++;
    		  continue;
    	  }
    	  cnt++;
    	  value++;
      }
      System.out.println(step+1);
	}
}
