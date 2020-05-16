package algorithm;

import java.util.Scanner;

public class ox퀴즈 {
	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         for(int i=0; i<n; i++) {
        	 String value = scan.next();
        	 int cnt=0;
        	 int step=1;
        	 for(int j=0; j<value.length(); j++) {
        		 if(value.charAt(j)=='O') {
        			 cnt+=step;
        			 step++;
        		 }else {
        			 step=1;
        		 }
        	 }
        	 System.out.println(cnt);
         }
	}
}
