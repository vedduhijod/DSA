class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // 1. Frequency map
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // 2. Min heap on pair
        // pair = {frequency, element}
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0])
                    return Integer.compare(a[0], b[0]);

                return Integer.compare(a[1], b[1]);
            }
        );

        // 3. Put {frequency, element} into heap
        for (int num : map.keySet()) {

            int freq = map.get(num);

            pq.offer(new int[]{freq, num});

            // 4. Keep heap size K
            if (pq.size() > k) {
                pq.poll();
            }
        }

        // 5. Get answer
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll()[1];
        }

        return ans;
    }
}