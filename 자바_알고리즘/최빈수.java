// 2020.04.30 java를 이용한 최빈수 구하기

package algorithm;

import java.util.Scanner;

public class problem {

   public static void main(String[] args) {
     int arr[] = {1,2,2,3,1,4,2,2,4,3,5,3,2};
     int count[] = new int[6];
     int maxindex=-1, maxvalue=0;
     for(int i=0; i<arr.length; i++){
    	 count[arr[i]]++;
     }
     for(int i=1; i<6; i++) {
    	 if(count[i]>=maxvalue) {
    		 maxvalue = count[i];
    		 maxindex= i;
    	 }
     }
     System.out.println(maxindex +" ("+maxvalue+"회)");
   }
}