
import java.util.Scanner;

public class 두수비교하기 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int start=1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(start+" ");
				start++;
			}
			System.out.println();
		}
	}

}
