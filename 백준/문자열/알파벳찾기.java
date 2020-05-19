package algorithm;

import java.util.Scanner;

public class 알파벳찾기{
	public static void main(String[] args) {
      String name;
      int count[] = new int[26];
      for(int i=0; i<26; i++) {
    	  count[i]=-1;
      }
      Scanner sc = new Scanner(System.in);
      name = sc.next();
      for(int i=0; i<name.length(); i++) {
    	  if(count[name.charAt(i)-'a']==-1)
    	  count[name.charAt(i)-'a']=i;
      }
      for(int i=0; i<26; i++) {
    	  System.out.print(count[i]+" ");
      }
	}
}
