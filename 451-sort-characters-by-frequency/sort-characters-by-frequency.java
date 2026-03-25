import java.util.*;

class Solution {
    public String frequencySort(String s) {

        // Step 1: frequency map
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: list of characters
        List<Character> list = new ArrayList<>(map.keySet());

        // Step 3: sort by frequency
        list.sort((a, b) -> map.get(b) - map.get(a));

        // Step 4: build result
        StringBuilder result = new StringBuilder();
        for (char c : list) {
            int freq = map.get(c);
            for (int i = 0; i < freq; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}