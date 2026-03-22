1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder result = new StringBuilder();
4        int count = 0;
5
6         for (char c : s.toCharArray()) {
7            if(c == '('){
8                if(count > 0){
9                    result.append(c);
10                }
11                count++;
12            }else {
13                count--;
14                if(count > 0){
15                    result.append(c);
16                }
17            }
18         }
19         return result.toString();
20    }
21}