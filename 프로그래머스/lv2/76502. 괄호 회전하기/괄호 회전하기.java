import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String str = s;
        
        for(int i=0 ; i<s.length() ; i++){
            if(checkStr(s)) answer++;
            s = s.substring(1, s.length()) + s.charAt(0);
        }
        
        return answer;
    }
    
    public boolean checkStr(String s){
        Stack<Character> stack = new Stack<>();
        try{
            for(int i=0 ; i<s.length() ; i++){
                switch(s.charAt(i)){
                    case '[':
                        stack.push('[');
                        break;
                    case ']':
                        if(stack.peek()!='[') return false;
                        else stack.pop();
                        break;
                    case '(':
                        stack.push('(');
                        break;
                    case ')':
                        if(stack.peek()!='(') return false;
                        stack.pop();
                        break;
                    case '{':
                        stack.push('{');
                        break;
                    case '}':
                        if(stack.peek()!='{') return false;
                        stack.pop();
                        break;
                }
            }
        }
        catch(EmptyStackException e){
            return false;
        }

        return stack.isEmpty() ? true : false;
    }
}