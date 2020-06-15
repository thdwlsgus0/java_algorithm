package java_array;

import java.util.Scanner;

public class 체스판다시칠하기 {
	public static int m,n, ans=9999,result;
	public static String str[];
    public static void value(int k, int l, char a, char b) {
    	   if(k%2==0) {
			   if(l%2==0) {
				   if(str[k].charAt(l)==a)result++;
			   }else if(l%2==1) {
				   if(str[k].charAt(l)==b)result++;
			   }
		   }else if(k%2==1) {
			   if(l%2==0) {
				   if(str[k].charAt(l)==b)result++;
			   }else if(l%2==1) {
				   if(str[k].charAt(l)==a)result++;
			   }
		   }
    }
	public static void check() {
		for(int i=0; i<n-7; i++) {
			for(int j=0; j<m-7; j++) {
				result=0;
				for(int k=i; k<8+i; k++) {
					for(int l=j; l<8+j; l++) {
					   if(str[i].charAt(j) == 'W') {
						   value(k,l,'B','W');
					   }else if(str[i].charAt(j)=='B') {
						   value(k,l,'W','B');
						   
					   }
					}
				}
				ans = Math.min(ans, result);
			}
		}
	}
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       m = sc.nextInt();
       str = new String[51];
       for(int i=0; i<n; i++) {
    	   str[i]=sc.next();
       }
       check();
       System.out.println(ans);
	}
}
