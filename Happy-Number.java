1class Solution {
2    public boolean isHappy(int n) {
3        int slow = getNext(n);
4        int fast = getNext(getNext(n));
5
6        while (slow != fast) {
7            slow = getNext(slow);
8            fast = getNext(getNext(fast));
9        }
10
11        return slow == 1;
12    }
13
14    private int getNext(int n) {
15        int sum = 0;
16
17        while (n > 0) {
18            int digit = n % 10;
19            sum += digit * digit;
20            n /= 10;
21        }
22
23        return sum;
24    }
25}