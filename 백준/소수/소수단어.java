package algorithm;

import java.util.Scanner;

public class 소수단어 {
    public static boolean isPrimenumber(int x) {
    	for(int i=2; i<x; i++) {
    		if(x%i==0)return false;
    	}
    	return true;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int sum=0;
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i) >='A' && name.charAt(i)<='Z') {
				sum+=name.charAt(i)-'A'+27;
			}
			else if(name.charAt(i)>='a' && name.charAt(i)<='z') {
				sum+=name.charAt(i)-'a'+1;
			}
		}
        if(isPrimenumber(sum) == true)System.out.println("It is a prime word.");
        else System.out.println("It is not a prime word.");
	}

}
