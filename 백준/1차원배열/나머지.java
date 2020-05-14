package practice;

import java.util.Scanner;

public class p_3052{
    
	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  int [] arr = new int[1001];
	  int data,ans=0;
	  for(int i=0; i<10; i++) {
		 data = scan.nextInt();
		 if(arr[data%42]>0)continue;
		 arr[data%42]++;
	  }
	  for(int i : arr) {
		  if(i!=0)ans++;
	  }
	  System.out.println(ans);
	}

}
