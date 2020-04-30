// 2020.04.30 java를 이용한 버블정렬 구현하기

package algorithm;

import java.util.Scanner;

public class problem {

   public static void main(String[] args) {
      int i,j,temp;
      int array[] = {1,17,3,6,9,4,7,10,11,5,19,14,15,12,20,18,16,13,2,8};
      for(i=0; i<array.length; i++) {
    	  for(j=0; j<array.length-1-i; j++) {
    		  if(array[j]>array[j+1]) {
    			  temp = array[j];
    			  array[j] = array[j+1];
    			  array[j+1]= temp;
    		  }
    	  }
      }
      for(i=0; i<array.length; i++) {
    	  System.out.print(array[i]+", ");
      }
   }
}