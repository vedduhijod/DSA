1class Solution {
2    public String longestPalindrome(String s) {
3        String longest = "";
4
5        for (int i = 0; i < s.length(); i++) {
6            for (int j = i + 1; j <= s.length(); j++) {
7                String sub = s.substring(i, j);
8
9                if (isPalindrome(sub) && sub.length() > longest.length()) {
10                    longest = sub;
11                }
12            }
13        }
14        return longest;
15    }
16
17    private boolean isPalindrome(String str) {
18        int left = 0, right = str.length() - 1;
19
20        while (left < right) {
21            if (str.charAt(left) != str.charAt(right)) {
22                return false;
23            }
24            left++;
25            right--;
26        }
27        return true;
28    }
29}