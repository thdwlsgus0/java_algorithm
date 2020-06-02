package algorithm;

import java.util.Scanner;

public class 설탕배달 {
	public static int n;
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     n = sc.nextInt();
	 if(n==4 || n==7) {
		 System.out.println(-1);
		 return;
	 }
	int  count = n/5;
	switch(n%5) {
	case 0:
		System.out.println(count);
		break;
	case 1:
	case 3:
		System.out.println(count+1);
		break;
	case 2:
	case 4:
		System.out.println(count+2);
		break;
	}
	}
}
