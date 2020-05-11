package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class a_b {

	public static void main(String[] args) {
	   int hamburger[] = new int[3];
	   int drink[] = new int[2];
	   Scanner scan = new Scanner(System.in);
	   for(int i=0; i<3; i++) {
		   hamburger[i] = scan.nextInt();
	   }
	   for(int i=0; i<2; i++) {
		   drink[i] = scan.nextInt();
	   }
	   Arrays.sort(hamburger);
	   Arrays.sort(drink);
	   System.out.println(hamburger[0]+drink[0]-50);
	}
}
