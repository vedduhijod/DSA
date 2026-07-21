import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if(c == '{' || c == '[' || c == '('){
                st.push(c);
            }else{
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.peek();   // Look at the top

                if ((c == ')' && top == '(') ||
                    (c == '}' && top == '{') ||
                    (c == ']' && top == '[')) {

                    st.pop();           // Remove only if it matches
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}