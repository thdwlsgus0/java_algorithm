package algorithm;

import java.util.Scanner;

public class 숫자의합 {
	public static void main(String[] args) {
        int n,sum=0;
        String name;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        name = sc.next();
        for(int i=0; i<name.length(); i++) {
        	sum+=(name.charAt(i)-'0');
        }
        System.out.println(sum);
	}
}
