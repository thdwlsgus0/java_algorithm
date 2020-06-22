package study1;

import java.util.Scanner;

public class 동전2 {
	public static int d[], value[];
	public static int n,k;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		value = new int[n+1];
		d = new int[k+1];
		for(int i=1; i<=n; i++) {
			value[i]=sc.nextInt();
		}
		for(int i=1; i<=k; i++)d[i]=100001;
		for(int i=1; i<=n; i++) {
			for(int j=value[i]; j<=k; j++) {
				d[j]= Math.min(d[j-value[i]]+1, d[j]);
			}
		}
		if(d[k]==100001)System.out.println(-1);
		else System.out.println(d[k]);
	}
}
