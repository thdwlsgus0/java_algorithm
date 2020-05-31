package algorithm;

import java.util.Scanner;

public class croati {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int ans=name.length();
		for(int i=0; i<name.length(); i++) {
			if(i+1<name.length() && name.charAt(i)=='c' && (name.charAt(i+1)=='-' || name.charAt(i+1)=='=') ) {
				ans--;
				i+=1;
			}else if(name.charAt(i) == 'd') {
				if(i+2<name.length() && name.charAt(i+1)=='z' && name.charAt(i+2)=='=') {
					ans-=2;
					i+=2;
				}else if( i+1< name.length() && name.charAt(i+1)== '-' ) {
					ans--;
					i+=1;
				}
			}else if(i+1<name.length() && name.charAt(i)=='l' && name.charAt(i+1)=='j' ) {
				ans--;
				i+=1;
			}else if( i+1<name.length() && name.charAt(i)=='n' && name.charAt(i+1)=='j' ) {
				ans--;
				i+=1;
			}else if(i+1<name.length()  && name.charAt(i)=='s' && name.charAt(i+1)=='=' ) {
				ans--;
				i+=1;
			}else if(i+1<name.length()&& name.charAt(i)=='z' && name.charAt(i+1)=='=' ) {
				ans--;
				i+=1;
			}
			
		}
  		System.out.println(ans);
 }
}
