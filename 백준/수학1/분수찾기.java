package algorithm;

import java.util.Scanner;

public class 분수 {
	public static int n;
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     n = sc.nextInt();
     boolean flag=true;
     int top=1, bottom=1;
     for(int i=2; i<=n; i++) {
    	 if(i==2) {
    		 bottom++;
    		 flag=false;
    	 }
    	 else if(bottom!=1 && flag==false) {
    		 bottom--;
    		 top++;
    	 }
    	 else if(bottom==1 && flag==false) {
    		 top++;
    		 flag=true;
    	 }
    	 else if(top!=1 && flag==true) {
    		 top--;
    		 bottom++;
    	 }
    	 else if(top==1 && flag==true) {
    		 bottom++;
    		 flag=false;
    	 }
     }
     System.out.println(top+"/"+bottom);
     
	}
}
