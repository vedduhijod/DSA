1class Solution {
2    public int maxDepth(String s) {
3      int currentDepth = 0;
4        int maxDepth = 0;
5
6        for (char ch : s.toCharArray()) {
7            if (ch == '(') {
8                currentDepth++;
9                maxDepth = Math.max(maxDepth, currentDepth);
10            } else if (ch == ')') {
11                currentDepth--;
12            }
13        }
14
15        return maxDepth;
16    }
17}