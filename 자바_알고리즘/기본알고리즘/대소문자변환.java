// 2020.05.02 대소문자 변환 대문자 -> 소문자,  소문자 -> 대문자

package algorithm;

import java.util.Scanner;

public class problem {

   public static void main(String[] args) {
	   char[] arr;
	   String str ="helloWorLD";
	   arr = str.toCharArray();
	   
	   for(int i=0; i<arr.length; i++) {
		   if(arr[i]>='a' && arr[i]<='z') {
			   arr[i]= (char)(arr[i]+'A'-'a');
		   }else if(arr[i]>='A' && arr[i]<='Z') {
			   arr[i] = (char)(arr[i]+'a'-'A');
		   }
	   }
	   for(int i=0; i<arr.length; i++) {
		   System.out.print(arr[i]+" ");
	   }
   }
}