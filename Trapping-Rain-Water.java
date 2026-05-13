1class Solution {
2    public int trap(int[] height) {
3
4        int n = height.length;
5
6        int[] prefixMax = new int[n];
7        int[] suffixMax = new int[n];
8
9        // Build prefix max array
10        prefixMax[0] = height[0];
11
12        for (int i = 1; i < n; i++) {
13            prefixMax[i] = Math.max(prefixMax[i - 1], height[i]);
14        }
15
16        // Build suffix max array
17        suffixMax[n - 1] = height[n - 1];
18
19        for (int i = n - 2; i >= 0; i--) {
20            suffixMax[i] = Math.max(suffixMax[i + 1], height[i]);
21        }
22
23        // Calculate trapped water
24        int totalWater = 0;
25
26        for (int i = 0; i < n; i++) {
27
28            int leftMax = prefixMax[i];
29            int rightMax = suffixMax[i];
30
31            totalWater += Math.min(leftMax, rightMax) - height[i];
32        }
33
34        return totalWater;
35    }
36}