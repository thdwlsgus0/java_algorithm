// 2020.05.02 백준 2884번 문제 알람시계문제

package algorithm;

import java.util.Scanner;

public class problem {

   public static void main(String[] args) {
	   int H,M;
	   Scanner scan = new Scanner(System.in);
	   H = scan.nextInt();
	   M = scan.nextInt();
	   if(M-45<0) {
		   if(H==0)H=23;
		   else H-=1;
		   M+=15;
	   }else {
		   M-=45;
	   }
	   System.out.print(H+" "+M);
   }
}