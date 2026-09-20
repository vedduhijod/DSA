import java.util.*;

class Solution {

    // Pair = {frequency, word}
    static class Pair {
        int freq;
        String word;

        Pair(int freq, String word) {
            this.freq = freq;
            this.word = word;
        }
    }

    public List<String> topKFrequent(String[] words, int k) {

        // 1. Frequency map
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }

        // 2. Min heap on pair
        // pair = {frequency, word}
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> {

                // Lower frequency comes first
                if (a.freq != b.freq)
                    return Integer.compare(a.freq, b.freq);

                // For same frequency, lexicographically
                // larger word comes first
                return b.word.compareTo(a.word);
            }
        );

        // 3. Put {frequency, word} into heap
        for (String word : map.keySet()) {

            int freq = map.get(word);

            pq.offer(new Pair(freq, word));

            // 4. Keep heap size K
            if (pq.size() > k) {
                pq.poll();
            }
        }

        // 5. Get answer
        List<String> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            ans.add(pq.poll().word);
        }

        // Heap gives reverse of required order
        Collections.reverse(ans);

        return ans;
    }
}