package algorithm;

public class problem {

	public static void main(String[] args) {
		System.out.println(9+"번쨰 값 = "+recursive(9));
	}
    
	public static int recursive(int n) {
		if(n==0)return 0;
		else if(n==1)return 1;
		else return recursive(n-1)+recursive(n-2);
	}
}