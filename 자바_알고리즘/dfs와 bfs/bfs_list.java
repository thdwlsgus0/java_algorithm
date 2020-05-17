package algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class bfs_list {
	static int nv;
	static int ne;
	static int start;
	static ArrayList<Integer>[] list; 
	static boolean[] visit;
	public static void bfs(int start) {
		Queue<Integer> que = new LinkedList<Integer>();
		visit[start] = true;
		que.offer(start);
		while(!que.isEmpty()) {
			int next = que.poll();
			System.out.print(next+" ");
			for(int a : list[next]) {
				if(visit[a]==false) {
					visit[a] = true;
					que.offer(a);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nv = scan.nextInt();
		int ne = scan.nextInt();
		int start = scan.nextInt();
		list = new ArrayList[nv+1];
		visit = new boolean[nv+1];
		for(int i=0; i<=nv; i++) {
			list[i] = new ArrayList<Integer>();
		}
		for(int i=0; i<ne; i++) {
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			list[n1].add(n2);
			list[n2].add(n1);
		}
	    bfs(start);
	}

}
