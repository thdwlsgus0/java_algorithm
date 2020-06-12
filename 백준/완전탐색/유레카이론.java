package algorithm1;

import java.util.Scanner;

public class 유레카이론 {
	public static int test_case;
	public static int T_n(int n) {
		return n*(n+1)/2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		test_case = sc.nextInt();
		for (int i = 0; i < test_case; i++) {
			int check=0;
            int data = sc.nextInt();
            all:for(int j=1; j<=data; j++)
            {
            	for(int k=1; k<=data; k++) {
            	   for(int l=1; l<=data; l++) {
            		  if(T_n(j)+T_n(k)+T_n(l)==data) {
            			check = 1;
            			break all;
            		  }
            	   }
            	}
            }
            System.out.println(check);
		}
	}
}
