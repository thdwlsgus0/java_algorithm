package algorithm;

import java.util.Scanner;

public class 팰린드롬수 {
 	public static int test_case;
 	public static boolean check(String name) {
 		for(int i=0; i<name.length()/2; i++) {
 			if(name.charAt(i) != name.charAt(name.length()-i-1)) {
 				return false;
 			}
 		}
 		return true;
 	}
	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String num;
         while(true) {
        	 num = sc.next();
        	 if(num.equals("0")){
        		 break;
        	 }
        	 if(check(num) == true) {
        		 System.out.println("yes");
        	 }else {
        		 System.out.println("no");
        	 }
         }
	}
}
