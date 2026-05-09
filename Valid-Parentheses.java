1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4        for(char ch : s.toCharArray()){
5if(ch == '(' || ch == '{' || ch == '[') {
6                stack.push(ch);
7            }
8            else{
9                if(stack.isEmpty()){
10                    return false;
11                }
12                char top = stack.pop();
13
14                if(
15                    (ch == ')' && top != '(') ||
16                    (ch == '}' && top != '{') ||
17                    (ch == ']' && top != '[')
18                )
19                return false;
20            }
21        }
22        return stack.isEmpty();
23
24    }
25}