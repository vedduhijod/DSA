1class Solution {
2
3    public int sumSubarrayMins(int[] arr) {
4
5        int n = arr.length;
6
7        int[] pse = findPSE(arr, n);
8        int[] nse = findNSE(arr, n);
9
10        long ans = 0;
11        int mod = 1_000_000_007;
12
13        for (int i = 0; i < n; i++) {
14
15            long left = i - pse[i];
16            long right = nse[i] - i;
17
18            long contribution = (left * right) % mod;
19
20            contribution = (contribution * arr[i]) % mod;
21
22            ans = (ans + contribution) % mod;
23        }
24
25        return (int) ans;
26    }
27
28    // Previous Smaller Element
29    private int[] findPSE(int[] arr, int n) {
30
31        int[] pse = new int[n];
32
33        Stack<Integer> st = new Stack<>();
34
35        for (int i = 0; i < n; i++) {
36
37            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
38                st.pop();
39            }
40
41            pse[i] = st.isEmpty() ? -1 : st.peek();
42
43            st.push(i);
44        }
45
46        return pse;
47    }
48
49    // Next Smaller Element
50    private int[] findNSE(int[] arr, int n) {
51
52        int[] nse = new int[n];
53
54        Stack<Integer> st = new Stack<>();
55
56        for (int i = n - 1; i >= 0; i--) {
57
58            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
59                st.pop();
60            }
61
62            nse[i] = st.isEmpty() ? n : st.peek();
63
64            st.push(i);
65        }
66
67        return nse;
68    }
69}