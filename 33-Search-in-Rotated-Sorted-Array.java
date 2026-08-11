class Solution {

    public int search(int[] a, int target) {

        int n = a.length;

        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int guess = low + (high - low) / 2;

            // Target found
            if (a[guess] == target) {
                return guess;
            }

            // PART 1
            if (a[guess] > a[n - 1]) {

                // target is greater than a[guess]
                if (a[guess] < target) {
                    low = guess + 1;
                }

                // target is smaller than a[0]
                else if (a[0] > target) {
                    low = guess + 1;
                }

                // target lies between a[0] and a[guess]
                else {
                    high = guess - 1;
                }

                continue;
            }

            // PART 2
            if (a[guess] > target) {
                high = guess - 1;
            }

            // target is greater than a[n-1]
            else if (a[n - 1] < target) {
                high = guess - 1;
            }

            // target lies between guess and n-1
            else {
                low = guess + 1;
            }
        }

        return -1;
    }
}