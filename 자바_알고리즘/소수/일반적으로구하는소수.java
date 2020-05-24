package algorithm;

import java.util.Scanner;

public class 소수 {
	public static boolean isPrime(int x) {
	  for(int i=2; i<x; i++) {
		  if(x%i==0)return false;
	  }
	  return true;
	}
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println(isPrime(n));
	}
}
