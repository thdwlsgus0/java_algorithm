package algorithm;

import java.util.Scanner;

public class 그룹단어체커 {
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int test_case = sc.nextInt();
       int count[];
       int ans=0;
       for(int i=0; i<test_case; i++) {
    	   String word = sc.next();
    	   count = new int[26];
    	   boolean flag=true;
    	   for(int j=0; j<word.length(); j++) {
    		   if(count[word.charAt(j)-'a']==0) {
    			   count[word.charAt(j)-'a']=1;
    		   }
    		   else if(count[word.charAt(j)-'a']==1 && word.charAt(j-1)!=word.charAt(j)) {
    		         flag = false;
    		         break;
    		   }
    	   }
    	   if(flag==true)ans++;
       }
       System.out.println(ans);
	}
}
