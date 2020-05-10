package algorithm;

import java.util.Scanner;

public class a_b {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);

	 int n = scan.nextInt();
	 int value[][] = new int[n][n];
	 int start=1;
	 for(int i=0; i<n; i++) {
		 for(int j=0; j<n; j++){
			 value[j][i] = start++;
		 }
	 }
	 for(int i=0; i<n; i++) {
		 for(int j=0; j<n; j++) {
			 System.out.print(value[i][j]+" ");
		 }
		 System.out.println();
	 }
	}

}
