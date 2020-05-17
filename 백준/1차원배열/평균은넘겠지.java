package algorithm;

import java.util.Scanner;

public class 평균은넘겠지 {
	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         for(int i=0; i<n; i++) {
        	 int test_case = scan.nextInt();
             int num[] = new int[test_case];
        	 int sum=0, avg=0,cnt=0;
        	 
        	 for(int j=0; j<test_case; j++) {
        		  num[j] = scan.nextInt();
        		 sum+=num[j];
        	 }
        	 avg = sum/test_case;
        	 for(int j=0; j<test_case; j++) {
        		 if(avg<num[j])cnt++;
        	 }
        	 System.out.print(String.format("%.3f",(double)cnt*100/test_case));
        	 System.out.println("%");
         }
	}
}
