package algorithm;

import java.util.Scanner;

public class 제곱근 {
	public static boolean isPrimeNumber(int x) {
		int end =(int)Math.sqrt(x);
		for(int i=2; i<=end; i++) {
			if(x%i==0)return false;
		}
		return true;
	}
	public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          System.out.println(isPrimeNumber(n));
	}
}
