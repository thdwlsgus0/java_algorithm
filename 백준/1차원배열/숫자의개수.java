package practice;

import java.util.Scanner;

public class p_2577 {
    
	public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   int arr[] = new int[10];
	   int a = scan.nextInt();
	   int b = scan.nextInt();
	   int c = scan.nextInt();
	   int result = a*b*c;
	   while(result!=0) {
		   arr[result%10]++;
		   result/=10;
	   }
	   for(int i : arr) {
		   System.out.println(i);
	   }
	}

}
