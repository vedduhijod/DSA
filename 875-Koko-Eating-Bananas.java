class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int st = 1;
        int end = Integer.MIN_VALUE;
        int answer = -1;

        for (int i = 0; i < piles.length; i++) {
            end = Math.max(end, piles[i]);
        }

        while (st <= end) {

            int gess = (st + end) / 2;

            long hours = findH(piles, gess);

            if (hours > h) {
                st = gess + 1;
            } else {
                answer = gess;
                end = gess - 1;
            }
        }

        return answer;
    }

    public long findH(int[] piles, int gess) {

        long hours = 0;

        for (int i = 0; i < piles.length; i++) {

            hours += piles[i] / gess;

            if (piles[i] % gess != 0) {
                hours++;
            }
        }

        return hours;
    }
}