class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        // Step 1: Find min and max
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];

            if (nums[i] > max)
                max = nums[i];
        }

        // Step 2: Find GCD
        return gcd(min, max);
    }

    // Euclidean Algorithm
    public int gcd(int a, int b) {
   int gcd = 1;
        if (a == b) return a | b;
        for(int i = 2; i <= a && i <= b; i++){
            if(a%i == 0 && b%i == 0)
            gcd = i;
        }
        return gcd;
    }
}
