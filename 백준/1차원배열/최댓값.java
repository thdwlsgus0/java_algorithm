package practice;

import java.util.Scanner;

public class min_max {

	public static void main(String[] args) {
		int value[] = new int[9];
		Scanner scan = new Scanner(System.in);
		int max = 0, index=0;
		for(int i=0; i<9; i++) {
			value[i] = scan.nextInt();
			if(max<value[i]) {
				index=i+1;
				max = value[i];
			}
		}
		System.out.println(max);
		System.out.print(index);
	}

}
