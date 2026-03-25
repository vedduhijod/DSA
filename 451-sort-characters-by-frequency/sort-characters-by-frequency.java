import java.util.*;

class Solution {
    public String frequencySort(String s) {
        // Step 1: Count frequency
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Create buckets (index = frequency)
        List<Character>[] buckets = new List[s.length() + 1];
        for (int i = 0; i <= s.length(); i++) {
            buckets[i] = new ArrayList<>();
        }

        // Step 3: Fill buckets
        for (char c : freqMap.keySet()) {
            int freq = freqMap.get(c);
            buckets[freq].add(c);
        }

        // Step 4: Build result (high → low frequency)
        StringBuilder result = new StringBuilder();

        for (int i = buckets.length - 1; i > 0; i--) {
            for (char c : buckets[i]) {
                for (int j = 0; j < i; j++) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}