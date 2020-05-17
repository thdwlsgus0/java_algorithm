package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bfs_matrix {
    static int Ne;
    static int Nv;
    static int start;
    static int[][] ad;
    static boolean[] visit;
    public static void bfs(int start) {
    	Queue<Integer> que = new LinkedList<Integer>();
    	visit[start]=true;
    	que.offer(start);
    	while(!que.isEmpty()) {
    		int next = que.poll();
    		System.out.print(next+" ");
    		for(int i=1; i<=Nv; i++) {
    			if(visit[i] == false && ad[next][i]==1) {
    				que.offer(i);
    				visit[i]=true;
    			}
    		}
    	}
    }
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    Nv = scan.nextInt();
	    Ne = scan.nextInt();
	    start = scan.nextInt();
	    ad = new int[Nv+1][Nv+1];
	    visit= new boolean[Nv+1];
		for(int i=0; i<Ne; i++) {
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			ad[n1][n2]=1;
			ad[n2][n1]=1;
		}
		bfs(start);
	}

}
