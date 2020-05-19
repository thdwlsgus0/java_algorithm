
import java.util.Scanner;

public class 문자열반복 {
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
	  int n;
      n = sc.nextInt();
      for(int i=0; i<n; i++) {
    	  int test_case = sc.nextInt();
    	  String name = sc.next();
          for(int j=0; j<name.length(); j++)
          {
        	  for(int k=0; k<test_case; k++) {
        		  System.out.print(name.charAt(j));
        	  }
          }
          System.out.println();
      }
	}
}
