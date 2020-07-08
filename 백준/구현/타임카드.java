package baekjoon;

import java.util.Scanner;

public class 타임카드 {
	public static int arr[];
	public static int a_h, a_m, a_c;
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     arr = new int[6];
     for(int i=0; i<3; i++) {
    	 for(int j=0; j<6; j++) {
    		 arr[j] = sc.nextInt();
    	 }
    	 if(arr[5]-arr[2]<0)
    		 {
    		    a_c = 60+arr[5]-arr[2];
    		    arr[4]--;
    		 }
    	 else a_c= arr[5] - arr[2];
    	 if(arr[4]-arr[1]<0)
    		 {
    		  a_m = 60+arr[4]-arr[1];
    		  arr[3]--;
    		 }
    	 else a_m = arr[4] - arr[1];
    	 if(arr[3]-arr[0]<0)a_h = 24+arr[3]-arr[0];
    	 else a_h = arr[3] - arr[0];
    	 System.out.println(a_h+" "+a_m+" "+a_c);
     }
	}
}
