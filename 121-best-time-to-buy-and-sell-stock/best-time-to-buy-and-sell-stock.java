class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int difference = 0;
        int j = prices[0];   // j = minimum price so far (buy price)

        for (int i = 1; i < n; i++) {
            difference = prices[i] - j;   // sell today

            if (difference > max) {
                max = difference;
            }

            if (prices[i] < j) {          // update buy price
                j = prices[i];
            }
        }
        return max;
    }
}
