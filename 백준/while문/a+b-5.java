package algorithm;

import java.util.Scanner;

public class a_b {

	public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   while(true) {
		   int a,b;
		   a = scan.nextInt();
		   b = scan.nextInt();
		   if(a==0 && b==0)break;
		   System.out.println(a+b);
	   }
	}

}
