import java.util.Scanner;

public class 소수 {
	public static int A,B,N;
	public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          A = sc.nextInt();B = sc.nextInt();N = sc.nextInt();
	      int cnt=0;
	      A%=B;
          while(true) {
        	  cnt++;
        	  if(cnt==N)break;
              A*=10;
              A%=B;
	      }
          A*=10;
          System.out.println(A/B);  
	}
}
