package algorithm;

import java.util.Scanner;

public class 문자열거꾸로출력 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String name = sc.next();
        for(int i=name.length()-1; i>=0; i--) {
        	System.out.print(name.charAt(i));
        }
	}
}
