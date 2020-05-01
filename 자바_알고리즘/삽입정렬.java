// 2020.05.01 삽입정렬

package algorithm;

import java.util.Scanner;

public class problem {

   public static void main(String[] args) {
	   int i, j, temp;
	   int array[]= {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
	   for(i=0; i<9; i++) {
		   j=i;
		   while(array[j]>array[j+1]) {
			   temp = array[j];
			   array[j] = array[j+1];
			   array[j+1]=temp;
			   j--;
		   }
	   }
	   for(i=0; i<10; i++) {
		   System.out.print(array[i]+", ");
	   }
   }
}