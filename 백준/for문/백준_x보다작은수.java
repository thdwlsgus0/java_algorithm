package algorithm;

import java.util.Scanner;

public class fighting {

	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
		 int n,x;
		 n  = scan.nextInt();
		 x = scan.nextInt();
		 for(int i=0; i<n; i++) {
			 int data = scan.nextInt();
			 if(data<x)System.out.print(data+" ");
		 }
	}
}
