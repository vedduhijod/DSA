1import java.util.*;
2
3class Solution {
4
5    public int largestRectangleArea(int[] heights) {
6
7        int n = heights.length;
8
9        int[] nse = findNSE(heights);
10        int[] pse = findPSE(heights);
11
12        int maxArea = 0;
13
14        for (int i = 0; i < n; i++) {
15
16            int width = nse[i] - pse[i] - 1;
17
18            int area = heights[i] * width;
19
20            maxArea = Math.max(maxArea, area);
21        }
22
23        return maxArea;
24    }
25
26    // Next Smaller Element
27    private int[] findNSE(int[] arr) {
28
29        int n = arr.length;
30
31        int[] nse = new int[n];
32
33        Stack<Integer> st = new Stack<>();
34
35        for (int i = n - 1; i >= 0; i--) {
36
37            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
38                st.pop();
39            }
40
41            if (st.isEmpty()) {
42                nse[i] = n;
43            } else {
44                nse[i] = st.peek();
45            }
46
47            st.push(i);
48        }
49
50        return nse;
51    }
52
53    // Previous Smaller Element
54    private int[] findPSE(int[] arr) {
55
56        int n = arr.length;
57
58        int[] pse = new int[n];
59
60        Stack<Integer> st = new Stack<>();
61
62        for (int i = 0; i < n; i++) {
63
64            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
65                st.pop();
66            }
67
68            if (st.isEmpty()) {
69                pse[i] = -1;
70            } else {
71                pse[i] = st.peek();
72            }
73
74            st.push(i);
75        }
76
77        return pse;
78    }
79}