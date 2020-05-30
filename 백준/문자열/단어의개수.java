package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어의개수 {

	public static void main(String[] args) throws IOException {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  String name = br.readLine();
	  int cnt = 0;
	  if(name.length() ==1 && name.charAt(0)==' ')cnt=0;
	  else{
		  String[] words = name.split(" ");
		  cnt = words.length;
		  if(name.charAt(0)==' ')cnt--;
	  }
	  System.out.println(cnt);
	}
}
