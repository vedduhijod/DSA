1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if (s.length() != t.length()) return false;
4
5        int[] count = new int[26]; // for lowercase letters
6
7        // Count characters from s
8        for (int i = 0; i < s.length(); i++) {
9            count[s.charAt(i) - 'a']++;
10        }
11
12        // Subtract using t
13        for (int i = 0; i < t.length(); i++) {
14            count[t.charAt(i) - 'a']--;
15        }
16
17        // Check all values are 0
18        for (int c : count) {
19            if (c != 0) return false;
20        }
21
22        return true;
23    }
24}