package algorithm;

import java.util.Scanner;

public class a_b {

	public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   int n = scan.nextInt();
	   int array[][] = new int[n][n];
	   int start=1;
	   for(int i=0; i<n; i++) {
		  if(i%2==0)
		  {
			  for(int j=0; j<n; j++) {
				  array[i][j] = start++;
			  }
		  }
		  else if(i%2==1) {
			  for(int j=n-1; j>=0; j--) {
				  array[i][j] = start++;
			  }
		  }
	   }
	   for(int i=0; i<n; i++) {
		   for(int j=0; j<n; j++) {
			   System.out.print(array[i][j]+" ");
		   }
		   System.out.println();
	   }
	}

}
