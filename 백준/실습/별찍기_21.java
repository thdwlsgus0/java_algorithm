package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 별찍기21 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		for (int i = 0; i < 2 * n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0) {
					if(j%2==0)bw.write("*");
					else bw.write(" ");
				}else if(i%2==1) {
					if(j%2==0)bw.write(" ");
					else bw.write("*");
				}
			}
			bw.write("\n");
		}
		bw.close();
		br.close();
	}
}
