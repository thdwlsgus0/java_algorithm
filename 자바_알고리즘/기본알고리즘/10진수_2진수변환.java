// 2020.05.01 10진수를 2진수로 변환하기

package algorithm;

import java.util.Scanner;

public class problem {

   public static void main(String[] args) {
      int inputNum = 19;
      int bin[] = new int[100];
      
      int index=0;
      while(inputNum!=0) {
    	  bin[index++]=inputNum%2;
    	  inputNum/=2;
      }
      for(int i=index-1; i>=0; i--) {
    	  System.out.print(bin[i]);
      }
   }
}