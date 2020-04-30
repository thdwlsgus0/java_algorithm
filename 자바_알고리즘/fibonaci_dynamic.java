package algorithm;

public class problem {

   public static void main(String[] args) {
      int[] arr = new int[10];
      arr[0]=1;
      arr[1]=1;
      for(int i=2; i<10; i++)
         arr[i] = arr[i-1]+arr[i-2];
      for(int i=0; i<10; i++) {
         System.out.println(i+1+"번쨰 피보나치 수"+arr[i]);
      }
   }

}