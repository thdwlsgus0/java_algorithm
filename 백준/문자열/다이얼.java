package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 다이얼 {

	public static void main(String[] args) throws IOException {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 String name = br.readLine();
	 int cnt=0;
	 for(int i=0; i<name.length(); i++) {
		 if(name.charAt(i) =='A' || name.charAt(i) == 'B' || name.charAt(i)=='C')cnt+=2;
		 else if(name.charAt(i) == 'D' || name.charAt(i) == 'E' || name.charAt(i) == 'F')cnt+=3;
		 else if(name.charAt(i)=='G' || name.charAt(i)=='H' || name.charAt(i)=='I')cnt+=4;
		 else if(name.charAt(i)=='J' || name.charAt(i)=='K' || name.charAt(i)=='L')cnt+=5;
		 else if(name.charAt(i)=='M' || name.charAt(i)=='N' || name.charAt(i)=='O')cnt+=6;
		 else if(name.charAt(i)=='P' || name.charAt(i)=='Q' || name.charAt(i)=='R' || name.charAt(i)=='S')cnt+=7;
		 else if(name.charAt(i)=='T' || name.charAt(i)=='U' || name.charAt(i)=='V')cnt+=8;
		 else if(name.charAt(i)=='W' || name.charAt(i)=='X' || name.charAt(i)=='Y' || name.charAt(i)=='Z')cnt+=9;
	     cnt++;
	 }
	 System.out.println(cnt);
	}
}
