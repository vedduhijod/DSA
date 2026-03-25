class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        StringBuilder sb = new StringBuilder();

        while (true) {
            int max = 0;
            char maxChar = 0;

            for (int i = 0; i < 128; i++) {
                if (freq[i] > max) {
                    max = freq[i];
                    maxChar = (char) i;
                }
            }

            if (max == 0) break;

            for (int i = 0; i < max; i++) {
                sb.append(maxChar);
            }

            freq[maxChar] = 0;
        }

        return sb.toString();
    }
}