package algorithm;

import java.util.ArrayList;

public class dfs_init {
    static ArrayList<Integer> list[];
    static int c[] = new int[8];
    public static void dfs(int node) {
    	if(c[node]==1)return;
    	c[node]=1;
    	System.out.println(node);
    	for(int a : list[node]) {
    		dfs(a);
    	}
    }
    
	public static void main(String[] args) {
		list = new ArrayList[8];
		for(int i=1;i<=7; i++) {
			list[i] = new ArrayList<>();
		}
		list[1].add(2);
		list[2].add(1);
		
		list[1].add(3);
		list[3].add(1);
		
		list[2].add(3);
		list[3].add(2);
		
		list[2].add(4);
		list[4].add(2);
		
		list[2].add(5);
		list[5].add(2);
		
		list[3].add(6);
		list[6].add(3);
		
		list[3].add(7);
		list[7].add(3);
		
		list[4].add(5);
		list[5].add(4);
		
		list[6].add(7);
		list[7].add(6);
		
		dfs(1);
	}

}
