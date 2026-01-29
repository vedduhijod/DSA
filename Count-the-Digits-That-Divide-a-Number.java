1class Solution {
2    public int countDigits(int num) {
3        int original = num;
4        int count = 0;
5
6        while (num > 0) {
7            int digit = num % 10;
8
9            if (digit != 0 && original % digit == 0) {
10                count++;
11            }
12
13            num = num / 10;
14        }
15
16        return count;
17    }
18}