package practice;

import java.util.Arrays;
import java.util.Scanner;

public class 세수 {
	public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int arr[] = new int[3];
          for(int i=0; i<3; i++) {
        	  arr[i] = scan.nextInt();
          }
          Arrays.sort(arr);
          System.out.println(arr[1]);
	}
}
