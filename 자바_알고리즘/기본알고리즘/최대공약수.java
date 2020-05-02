// 2020.05.02 최대공약수 구하기

package algorithm;

import java.util.Scanner;

public class problem {
   
   public static int gcd(int a, int b) {
	   while(b!=0) {
		   int tmp = a%b;
		   a= b;
		   b= tmp;
	   }
	   return a;
   }
   public static void main(String[] args) {
	   int n,m;
	   Scanner scan = new Scanner(System.in);
	   n = scan.nextInt();
	   m = scan.nextInt();
	   System.out.println(gcd(n,m));
   }
}