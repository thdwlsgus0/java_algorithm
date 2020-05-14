package practice;

import java.util.Scanner;

public class min_max {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n,m,result=1;
	    n = scan.nextInt();
	    m = scan.nextInt();
	    for(int i=0; i<m; i++) {
	      result = result*n;
	    }
	    System.out.println(result);
	}

}
