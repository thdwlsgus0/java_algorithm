package practice;

import java.util.Scanner;

public class 반복 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int f = scan.nextInt();
        for(int i=1; i<=9; i++) {
            for(int j=s; j<=f; j++) {
            	System.out.print(j+" * "+i+" = "+(i*j) +"  ");
            }
            System.out.println();
        }
  
	}
}

