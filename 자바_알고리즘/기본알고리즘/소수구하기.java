 // 2020.05.04 에라토스테네스의 체를 이용한 소수구하기
package algorithm;

import java.util.Scanner;

public class 덧셈 {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  boolean []bl = new boolean[101];
	  int n = scan.nextInt();
	  for(int i=1; i<=100; i++) {
		  bl[i]=false;
	  }
	  for(int i=2; i<=100; i++)
	  {
		  if(bl[i]==true)continue;
		  bl[i]=false;
		  for(int j=i+i; j<=100; j+=i) {
			  if(!bl[j])bl[j]=true;
		  }
	  }
	  if(!bl[n])System.out.println(n+"은 소수입니다.");
	  else System.out.println(n+"은 소수가 아닙니다.");
}
}
