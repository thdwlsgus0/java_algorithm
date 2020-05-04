 // 2020.05.04 백준 수 정렬하기 2750번 문제
package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class 덧셈 {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  int n = scan.nextInt();
	  int temp;
	  int value[] = new int[n];
	  for(int i=0; i<n; i++) {
		  value[i] = scan.nextInt();
	  }
	 Arrays.sort(value);
	 for(int i=0; i<n; i++) {
		 System.out.println(value[i]);
	 }
}
}
