1class Solution {
2    public int beautySum(String s) {
3        int n = s.length();
4        int totalBeauty = 0;
5
6                for (int i = 0; i < n; i++) {
7            int[] freq = new int[26];
8
9            for (int j = i; j < n; j++) {
10                freq[s.charAt(j) - 'a']++;
11
12                int maxFreq = 0;
13                int minFreq = Integer.MAX_VALUE;
14
15                for (int f : freq) {
16                    if (f > 0) {
17                        maxFreq = Math.max(maxFreq, f);
18                        minFreq = Math.min(minFreq, f);
19                    }
20                }
21
22                totalBeauty += (maxFreq - minFreq);
23            }
24        }
25
26        return totalBeauty;
27    }}
28