package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class a_b {

	public static void main(String[] args) throws NumberFormatException, IOException {
	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	 int n = Integer.parseInt(bf.readLine());
	 List<String> list = new ArrayList<String>();
	 for(int i=0; i<n; i++) {
		 String temp = bf.readLine();
		 list.add(temp);
	 }
	 Collections.sort(list, new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			if(o1.length()<o2.length())return -1;
			else if(o1.length()==o2.length()) {
				if(add(o1)== add(o2)) {
					return o1.compareTo(o2);
				}else {
					return Integer.compare(add(o1), add(o2));
				}
			}else {
				return 1;
			}
		}
		 
	 });
	 for(String s : list) {
		 System.out.println(s);
	 }
	}
	public static int add(String a) {
		int sum=0;
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)>='0' && a.charAt(i)<='9') {
				sum+=a.charAt(i)-'0';
			}
		}
		return sum;
	}
}
