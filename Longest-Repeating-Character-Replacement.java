1class Solution {
2    public int characterReplacement(String s, int k) {
3        int[] freq = new int[26];
4        int left = 0;
5        int maxFreq = 0;
6        int maxLen = 0;
7
8        for(int right = 0; right < s.length(); right++){
9            char ch = s.charAt(right);
10            freq[ch - 'A']++;
11            maxFreq = Math.max(maxFreq, freq[ch - 'A']);
12             while ((right - left + 1) - maxFreq > k) {
13                freq[s.charAt(left) - 'A']--;
14                left++;
15            }
16            maxLen = Math.max(maxLen, right - left + 1);
17        }
18        return maxLen;
19    }
20}