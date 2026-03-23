1class Solution {
2    public String reverseWords(String s) {
3        String[] words = s.trim().split("\\s+");
4        StringBuilder sb = new StringBuilder();
5        
6        for (int i = words.length - 1; i >= 0; i--) {
7            sb.append(words[i]);
8            if (i != 0)  sb.append(" ");
9        }
10        
11        return sb.toString();
12    }
13}