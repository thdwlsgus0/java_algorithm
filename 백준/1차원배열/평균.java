package algorithm;

import java.util.Scanner;

public class 평균 {

	public static void main(String[] args) {
		int n;
		double sum=0;
		Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    int max=0;
	    int arr[] = new int[n];
	    for(int i=0; i<n; i++) {
	    	arr[i] = sc.nextInt();
	    	max = Math.max(max, arr[i]);
	    }
	    for(int i=0; i<n; i++) {
	    	sum+= (arr[i]*100)/(double)max ;
	    }
	   System.out.println(String.format("%.2f",(double)sum/n ));
	}

}
