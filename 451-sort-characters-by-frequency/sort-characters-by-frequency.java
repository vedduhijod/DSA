class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];

        // Step 1: Count frequency
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        // Step 2: Buckets (index = frequency)
        StringBuilder[] buckets = new StringBuilder[s.length() + 1];

        for (int i = 0; i < 128; i++) {
            int f = freq[i];
            if (f > 0) {
                if (buckets[f] == null) {
                    buckets[f] = new StringBuilder();
                }
                buckets[f].append((char) i);
            }
        }

        // Step 3: Build result
        StringBuilder result = new StringBuilder();

        for (int i = buckets.length - 1; i > 0; i--) {
            if (buckets[i] != null) {
                for (char c : buckets[i].toString().toCharArray()) {
                    for (int j = 0; j < i; j++) {
                        result.append(c);
                    }
                }
            }
        }

        return result.toString();
    }
}