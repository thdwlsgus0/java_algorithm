package practice;

import java.util.Arrays;
import java.util.Scanner;

public class 세수 {
	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         String name = scan.next();
         int [] ans = new int[10];
         for(int i=0; i<name.length(); i++) {
        	 ans[(int)(name.charAt(i)-'0')]++;
         }
        for(int i=0; i<10; i++) {
        	System.out.println(i+":"+ans[i]);
        }
	}
}
