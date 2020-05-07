 // 2020.05.07 백준 2751번 문제
package algorithm;

import java.util.Scanner;

public class 덧셈 {
	static int n;
	static int sorted[];
    public static void mergeSort(int[] a, int n, int m) {
    	if(n<m) {
    		int middle = (n+m)/2;
    		mergeSort(a, n, middle);
    		mergeSort(a, middle+1, m);
    		merge(a, n, middle, m);
    	}
    }
    public static void merge(int [] a, int n, int middle, int m) {
    	int i = n;
        int j = middle+1;
        int k = n;
        while(i<=middle && j<=m) {
        	if(a[i]<=a[j]) {
        	  sorted[k]= a[i];
        	  i++;
        	}else {
        		sorted[k]= a[j];
        		j++;
        	}
        	k++;
        }
        if(i>middle) {
        	for(int t=j; t<=m; t++) {
        		sorted[k]=a[t];
        		k++;
        	}
        }else {
        	for(int t=i; t<=middle; t++) {
        		sorted[k] = a[t];
        		k++;
        	}
        }
        for(int t=n; t<=m; t++) {
        	a[t] = sorted[t];
        }
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int array[] = new int[n];
		sorted = new int[n];
		for(int i=0; i<n; i++) {
			array[i] = scan.nextInt();
		}
		mergeSort(array, 0, n-1);
		for(int i=0; i<n; i++) {
			System.out.println(array[i]);
		}
    }
}
