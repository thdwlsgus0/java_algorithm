package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class a_b {

	public static void main(String[] args) throws NumberFormatException, IOException {
	  BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	  int n= Integer.parseInt(bf.readLine());
	  int count[] = new int[10001];
	  for(int i=0; i<n; i++) {
		  int v = Integer.parseInt(bf.readLine());
		  count[v]++;
	  }
	  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	  for(int i=1; i<=10000; i++) {
		  for(int j=0; j<count[i]; j++) {
			 bw.write(Integer.toString(i) + "\n");
		  }
	  }
	  bf.close();
	  bw.close();
	}
	
}
