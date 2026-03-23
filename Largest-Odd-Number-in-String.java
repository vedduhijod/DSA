1class Solution {
2    public String largestOddNumber(String num) {
3        for (int i = num.length() - 1; i >= 0; i--) {
4            char ch = num.charAt(i);
5            
6            if ((ch - '0') % 2 == 1) {
7                return num.substring(0, i + 1);
8            }
9        }
10        
11        return "";
12    }
13}