package algorithm;

import java.util.Scanner;

public class a_b {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  int n = scan.nextInt();
	  int [][] arr = new int[n][n];
	  for(int i=0; i<n; i++) {
		  for(int j=0; j<n; j++) {
			 System.out.print((i+1) * (j+1)+" ");
		  }
		  System.out.println();
	  }
	   
	}
}
