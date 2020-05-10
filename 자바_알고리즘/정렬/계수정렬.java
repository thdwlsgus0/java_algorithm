package algorithm;

import java.util.Scanner;

public class a_b {
    static int temp;
    static int count[] = new int[6];
    static int array[]= {1,3,2,4,3,2,5,3,1,2,3,4,4,3,5,1,2,3,5,2};
	public static void main(String[] args) {
	  for(int i=1; i<=5; i++) {
		  count[i]=0;
	  }
	  for(int i=0; i<20; i++)
	  {
		  count[array[i]]++;
	  }
	  for(int i=1; i<=5; i++) {
		  if(count[i]!=0) {
			  for(int j=0; j<count[i]; j++) {
				  System.out.print(i+" ");
			  }
		  }
	  }
	}

}
