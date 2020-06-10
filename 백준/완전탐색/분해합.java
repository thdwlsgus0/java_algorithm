package algorithm1;

import java.util.Scanner;

public class 분해합 {
	public static int n;
	public static boolean value[];
	public static int seperating(int n) {
		for(int i=1; i<=n; i++) {
			int sum = i;
			int step = i;
			while(step != 0) {
				int tmp = step%10;
				step/=10;
				sum+=tmp;
			}
			if(sum==n)return i;
		}
		return 0;
	}
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      if(seperating(n)!=0)System.out.println(seperating(n));
      else System.out.println(0);
	}
}
