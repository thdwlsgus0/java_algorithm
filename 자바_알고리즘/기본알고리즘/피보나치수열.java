// 2020-05-06 팩토리얼 문제

package algorithm;

import java.util.Scanner;

public class fibonaci {
  public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 int n = scan.nextInt();
	 int array[] = new int[11];
	 array[0]=1;
	 array[1]=1;
	 for(int i=2; i<=n; i++) array[i] = i*array[i-1];
	 for(int s: array) {
		 System.out.println(s);
	 }
 }
}
