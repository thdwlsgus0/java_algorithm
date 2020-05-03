 // 백준 10950번 문제 a+b-3
package algorithm;

import java.util.Scanner;

public class 덧셈 {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  int n = scan.nextInt();
	  for(int i=0; i<n; i++) {
		  int a,b;
		  a = scan.nextInt();
		  b = scan.nextInt();
		  System.out.println(a+b);
	  }
	}

}
