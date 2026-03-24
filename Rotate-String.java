1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if (s.length() != goal.length())
4            return false;
5
6        // s+s contains all possible rotations of s
7        String newString = s + s;
8
9        return newString.contains(goal);
10    }
11}