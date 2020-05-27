package algorithm;

import java.util.Scanner;

public class 팰린드롬 {
	public static int test_case;
	public static String pellin;
	public static boolean check(String pellin) {
		boolean flag = true;
		for(int i=0; i<pellin.length()/2; i++) {
			if(pellin.charAt(i) != pellin.charAt(pellin.length()-i-1)) {
				flag =false;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    	 pellin = sc.next();
    	 if(check(pellin)==true) {
    		 System.out.println("true");
    	 }else System.out.println("false");
     }
}
