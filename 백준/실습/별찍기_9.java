package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class stack {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for(int i=n-1; i>=0; i--) {
			for(int j=0; j<n-i-1; j++)
			{
				bw.write(" ");
			}
			for(int j=0; j<2*i+1; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-2; j++) {
				bw.write(" ");
			}
			for(int j=0; j<2*(i+1)+1; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.close();
		br.close();
	}
}
