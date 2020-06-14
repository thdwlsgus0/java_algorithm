package java_array;

import java.util.Scanner;

public class 숫자야구 {
	public static int total_ball[][][];
	public static boolean visit[][][];
	public static int n;
	public static void check(char[] goal, int strike, int ball) {
		for(int a=1; a<=9; a++) {
			for(int b=1; b<=9; b++) {
				for(int c=1; c<=9; c++) {
					int local_strike=0, local_ball=0;
					if(a==b || b==c || c==a)continue;
					if(a==goal[0]-'0')local_strike++;
					if(b==goal[1]-'0')local_strike++;
					if(c==goal[2]-'0')local_strike++;
					if(a==goal[1]-'0')local_ball++;
					if(a==goal[2]-'0')local_ball++;
					if(b==goal[0]-'0')local_ball++;
					if(b==goal[2]-'0')local_ball++;
					if(c==goal[0]-'0')local_ball++;
					if(c==goal[1]-'0')local_ball++;
					if(strike==local_strike && ball==local_ball && visit[a][b][c]==false) {
						total_ball[a][b][c]=1;
					}else{
						total_ball[a][b][c]=0;
						visit[a][b][c]=true;
					}
				
				}
			}
		}
	}
	public static void main(String[] args) {
        total_ball = new int[10][10][10];
        visit = new boolean[10][10][10];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0; i<n; i++) {
        	int strike,ball;
        	String goal = sc.next();
        	char[] to_arr = goal.toCharArray();
        	strike = sc.nextInt();
        	ball = sc.nextInt();
        	check(to_arr, strike, ball);
        }
        int result=0;
        for(int i=1; i<=9; i++)
        {
        	for(int j=1; j<=9; j++)
        	{
        		for(int k=1; k<=9; k++)
        		{
        			if(total_ball[i][j][k]==1)
        				{
        				   result++;
        				}
        		}
        	}
        }
        System.out.println(result);
	}
}
