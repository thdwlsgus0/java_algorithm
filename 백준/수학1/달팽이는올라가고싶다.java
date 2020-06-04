import java.util.Scanner;

public class 달팽이 {
	public static void main(String[] args) {
      int A,B,V;
      Scanner sc = new Scanner(System.in);
      A = sc.nextInt();
      B = sc.nextInt();
      V = sc.nextInt();
      System.out.println((V-B-1)/(A-B)+1);
	}
}
