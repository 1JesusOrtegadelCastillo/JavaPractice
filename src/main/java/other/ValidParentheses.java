package other;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++ ){
            char ch = s.charAt(i);
            if(map.containsValue(ch))
                st.push(ch);
            else{
                if(st.isEmpty() || map.get(ch) != st.pop())
                    return false;
            }
        }
        return st.isEmpty();

    }
}
