import java.util.Scanner;
public class 부분수열의합 {
	public static int n,s,ans, value[];
	public static void dfs(int sum, int index ) {
		if(index == n) return;
		if(sum+value[index] == s) ans++;
		dfs(sum+value[index],index+1);
		dfs(sum, index+1);
	}
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    s = sc.nextInt();
    value = new int[n];
    for(int i=0; i<n; i++) value[i] = sc.nextInt();
       dfs(0, 0);
       System.out.println(ans);
	}
}
