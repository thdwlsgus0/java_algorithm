package algorithm;

import java.util.Scanner;

public class problem {

   public static void main(String[] args) {
      int[] arr= {1,17,3,6,9,4,7,10,11,5,19,14,15,12,20,18,16,13,2,8};
      int index=0, max, temp;
      for(int i=0; i<arr.length; i++) {
    	  max = -1;
    	  for(int j=i; j<arr.length; j++) {
    		  if(max<arr[j]) {
    			 index = j;
    			 max = arr[j];
    		  }
    	  }
    	  temp = arr[index];
    	  arr[index]= arr[i];
    	  arr[i] = temp;
      }
      for(int i=0; i<arr.length; i++) {
   	    System.out.print(arr[i]+", ");
      }
   }
}