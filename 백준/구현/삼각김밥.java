package baekjoon;

import java.util.Scanner;

public class 삼각김밥 {
	public static int x,y;
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       x = sc.nextInt();
       y = sc.nextInt();
       int n = sc.nextInt();
       double minvalue = ((double)x/y*1000);
       for(int i=0; i<n; i++) {
    	   int ny,nx;
    	   ny = sc.nextInt();
    	   nx = sc.nextInt();
    	   minvalue = Math.min((double)ny/nx*1000, minvalue); 
       }
       System.out.printf("%.2f", minvalue);
	}
}
