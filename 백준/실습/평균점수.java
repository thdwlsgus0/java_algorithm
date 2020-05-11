package algorithm;

import java.util.Scanner;

public class a_b {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  int score[] = new int[5];
	  int result = 0;
	  for(int i=0; i<5; i++) {
		  score[i] = scan.nextInt();
		  if(score[i]<40)result+=40;
		  else result+=score[i];
	  }
	  System.out.println(result/5);
	}
}
