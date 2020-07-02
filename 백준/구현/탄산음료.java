package baekjoon;

import java.util.Scanner;

public class 탄산음료 {
	public static int e,f,c;
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int answer=0;
    e = sc.nextInt();
    f = sc.nextInt();
    c = sc.nextInt();
    int sum= e+f, namerge=0;
    while(true) {
       if(sum<c)break;
       answer+=sum/c;
       sum= sum%c + sum/c;
    }
    System.out.println(answer);
	}
}
