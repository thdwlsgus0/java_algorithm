package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class a_b {

	public static void main(String[] args) throws  IOException {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int n = Integer.parseInt(br.readLine());
     List<String> list= new ArrayList<String>();
    
     
     for(int i=0; i<n; i++) {
    	String temp= br.readLine();
    	 if(!list.contains(temp))
    		 list.add(temp);
     }
     
     Collections.sort(list, new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			if(o1.length() > o2.length())return 1;
			else if(o1.length()<o2.length())return -1;
			else return o1.compareTo(o2);
		}
     });
     for(String a : list) {
    	 System.out.println(a);
     }
	}
}
