1class Solution {
2    public boolean isPalindrome(int x) {
3        if (x < 0) return false;
4        int original = x;
5        int reverse = 0;
6        while(x > 0){
7            int digit = x % 10;
8            reverse = reverse * 10 + digit;
9            x = x / 10;
10        }
11        return original == reverse;
12    }
13   
14}