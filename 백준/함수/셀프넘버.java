package algorithm;

public class 셀프넘버 {
	static boolean[] cnt = new boolean[10001];
	public static int constructor(int n) {
		int sum=n;
		while(n!=0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) { 
		  
          for(int i=1; i<=10000; i++) {
        	  if(constructor(i)>10000)continue;
        	  cnt[constructor(i)] = true;
          } 
          for(int i=1; i<=10000; i++) {
        	  if(cnt[i] == false)System.out.println(i);
          }
	}
}
