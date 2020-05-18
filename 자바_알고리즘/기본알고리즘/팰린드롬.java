package algorithm;

public class 팰린드롬 {

	public static void main(String[] args) {
		String n = "123521";
		int len = n.length();
		boolean flag = true;
		
		for(int i=0; i<len/2; i++) {
			if(n.charAt(i) != n.charAt(len-i-1)) {
				flag = false;
			}
		}
      System.out.println(flag);
	}

}
