package algorithm;

import java.util.Scanner;

public class 단어공부 {
	public static String name;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		name = name.toUpperCase();
		int [] count = new int[26];
		int max=0;
		for (int i = 0; i < name.length(); i++) {
            count[name.charAt(i)-'A']++;
		}
		for(int i=0; i<26; i++) {
			max = Math.max(max, count[i]);
		}
		int answer=0;
		int max_index=0;
		for(int i=0; i<26; i++) {
			if(max==count[i]) {
				if(answer==1)
					{ answer++;break;}
				else {
					answer++;
					max_index=i;
				}
			}
		}
		if(answer==2)System.out.println("?");
		else {
			System.out.println((char)(max_index+'A'));
		}
	}
}
