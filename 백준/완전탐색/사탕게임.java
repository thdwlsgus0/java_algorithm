import java.util.Scanner;

public class 사탕게임 {
	public static int n,ans;
	public static char[][] candy;
	public static int []dx = {1,0,-1,0};
	public static int []dy = {0,1,0,-1};
	public static void swap(int ni, int nj, int i, int j) {
		char temp = candy[ni][nj];
		candy[ni][nj] = candy[i][j];
		candy[i][j] = temp;
	}
	public static int count_max(int i, int j) {
		int max_width=1, max_height=1, width=1, height=1;
		for(int y=0; y<n-1; y++) {
			if(candy[i][y]==candy[i][y+1])width++;
			else if(candy[i][y]!=candy[i][y+1]){
				max_width = Math.max(max_width, width);
				width=1;
			}
			if(candy[y][j]==candy[y+1][j])height++;
			else if(candy[y][j] != candy[y+1][j]) {
				max_height = Math.max(max_height, height);
				height=1;
			}
		}
		max_width = Math.max(max_width, width);
		max_height = Math.max(max_height, height);
 		int result = Math.max(max_width, max_height);
		return result;
	}
    public static void check(int i, int j) {
    	for(int k=0; k<4; k++) {
    		int ni = i + dx[k];
    		int nj = j + dy[k];
    		if(ni>=0 && ni<n && nj>=0 && nj<n) {
    	        if(candy[ni][nj] != candy[i][j])
    	        {
    	        	swap(ni,nj, i,j);
        		    ans = Math.max(ans, count_max(i,j));
        		    swap(ni,nj,i,j);
    	        }else if(candy[ni][nj] == candy[i][j]){
    	        	ans = Math.max(ans, count_max(i,j));
    	        }
    		}
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		candy = new char[n][n];
		// 문자열 입력받기
		for (int i = 0; i < n; i++) {
			candy[i] = sc.next().toCharArray();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
               check(i,j);
			}
		}
    	System.out.println(ans);
	}
}
