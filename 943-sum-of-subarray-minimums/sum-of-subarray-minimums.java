class Solution {

    public int sumSubarrayMins(int[] arr) {

        int n = arr.length;

        int[] pse = findPSE(arr, n);
        int[] nse = findNSE(arr, n);

        long ans = 0;
        int mod = 1_000_000_007;

        for (int i = 0; i < n; i++) {

            long left = i - pse[i];
            long right = nse[i] - i;

            long contribution = (left * right) % mod;

            contribution = (contribution * arr[i]) % mod;

            ans = (ans + contribution) % mod;
        }

        return (int) ans;
    }

    // Previous Smaller Element
    private int[] findPSE(int[] arr, int n) {

        int[] pse = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            pse[i] = st.isEmpty() ? -1 : st.peek();

            st.push(i);
        }

        return pse;
    }

    // Next Smaller Element
    private int[] findNSE(int[] arr, int n) {

        int[] nse = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            nse[i] = st.isEmpty() ? n : st.peek();

            st.push(i);
        }

        return nse;
    }
}