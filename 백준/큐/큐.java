package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 큐 {
	public static int n;
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    Queue<Integer> que = new LinkedList<>();
    int last=0;
    for(int i=0; i<n; i++) {
    	String command;
    	command = sc.next();
    	
    	if(command.equals("push")) {
    		int data;
    		data = sc.nextInt();
    		last = data;
    		que.offer(data);
    	}else if(command.equals("front")) {
    		if(que.isEmpty())System.out.println(-1);
    		else System.out.println(que.peek());
    	}else if(command.equals("back")) {
    		if(que.isEmpty())System.out.println(-1);
    		else System.out.println(last);
    	}else if(command.equals("size")) {
    		System.out.println(que.size());
    	}else if(command.equals("empty")) {
    		if(que.isEmpty())System.out.println(1);
    		else System.out.println(0);
    	}else if(command.equals("pop")) {
    		if(que.isEmpty())System.out.println(-1);
    		else System.out.println(que.poll());
    	}
    }
	}
}
