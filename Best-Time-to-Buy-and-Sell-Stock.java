1class Solution {
2    public int maxProfit(int[] prices) {
3        int n = prices.length;
4        int max = 0;
5        int difference = 0;
6        int j = prices[0];   // j = minimum price so far (buy price)
7
8        for (int i = 1; i < n; i++) {
9            difference = prices[i] - j;   // sell today
10
11            if (difference > max) {
12                max = difference;
13            }
14
15            if (prices[i] < j) {          // update buy price
16                j = prices[i];
17            }
18        }
19        return max;
20    }
21}
22