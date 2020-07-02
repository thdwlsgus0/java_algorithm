package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 카드게임2 {
	public static int n;
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Queue<Integer> que = new LinkedList<>();
     n = sc.nextInt();
     for(int i=1; i<=n; i++) {
    	 que.offer(i);
     }
     while(que.size()!=1) {
    	 int data = que.poll();
    	 int front = que.poll();
    	 que.offer(front);
     }
     System.out.println(que.peek());
	}
}
