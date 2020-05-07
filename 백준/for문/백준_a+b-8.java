 // 2020.05.07 백준 A+B-8 찍기
package algorithm;

import java.util.Scanner;

public class 덧셈 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0; i<n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println("Case #"+(i+1)+": "+a+" + "+b+" = "+(a+b));
		}
    }
}
