import java.util.*;
class Solution {
    public int solution(String arrangement) {
        int answer = 0;
        Stack<Character> st = new Stack<Character>();
        char [] array = arrangement.toCharArray();
        for(int i=0; i<arrangement.length(); i++){
            if(array[i] == '(')st.push('(');
            else{
                st.pop();
                if(array[i-1]=='(')answer+=st.size();
                else if(array[i-1]==')')answer+=1;
            }
        }
        return answer;
    }
}