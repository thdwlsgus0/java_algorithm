 // 2020.05.07 백준 A+B-7 찍기
package algorithm;

import java.util.Scanner;

public class 덧셈 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int sum=0;
	    while(n!=0) {
	    	sum+=n%10;
	    	n/=10;
	    }
	    System.out.println(sum);
    }
}
