package practice;

import java.util.Scanner;

public class min_max {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int [] value = new int[n];
        for(int i=0; i<n; i++) {
        	value[i] = scan.nextInt();
        }
        int min = value[0];
        int max = value[0];
        for(int i=1; i<n; i++) {
        	max = Math.max(value[i], max);
        	min = Math.min(value[i], min);
        }
        System.out.print(min+" "+max);
	}

}
