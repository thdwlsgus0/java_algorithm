 // 2020.05.04 8393번 문제 합
// 2020.05.04 8393번 문제 합
package algorithm;

import java.util.Scanner;

public class 덧셈 {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  int n =  scan.nextInt();
	  int sum=0;
	  for(int i=1; i<=n; i++) {
		  sum+=i;
	  }
	  System.out.println(sum);
	}

}
