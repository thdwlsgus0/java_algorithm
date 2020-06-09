package algorithm1;

import java.util.Arrays;
import java.util.Scanner;

public class 일곱난쟁이 {
	public static int nine[] = new int[9]; 
	public static boolean check[];
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int sum=0;
		
        for(int i=0; i<9; i++) {
			nine[i] = sc.nextInt();
			sum+=nine[i];
		}
        Arrays.sort(nine);
    	check = new boolean[9];
		all:for(int i=0; i<8; i++) {
			for(int j=i+1; j<9; j++) {
				if(sum-nine[i]-nine[j]==100) {
					check[i]=true;
					check[j]=true;
					break all;
				}
			}
		}
		for(int i=0; i<9; i++) {
			if(check[i]==true)continue;
			else System.out.println(nine[i]);
		}
		
	}
}
