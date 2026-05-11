1class Solution {
2
3    public int[] asteroidCollision(int[] asteroids) {
4
5        Stack<Integer> st = new Stack<>();
6
7        for (int i = 0; i < asteroids.length; i++) {
8
9            // positive asteroid
10            if (asteroids[i] > 0) {
11
12                st.push(asteroids[i]);
13            }
14
15            // negative asteroid
16            else {
17
18                // remove smaller positive asteroids
19                while (!st.isEmpty()
20                        && st.peek() > 0
21                        && st.peek() < Math.abs(asteroids[i])) {
22
23                    st.pop();
24                }
25
26                // equal size -> both destroy
27                if (!st.isEmpty()
28                        && st.peek() == Math.abs(asteroids[i])) {
29
30                    st.pop();
31                }
32
33                // current asteroid survives
34                else if (st.isEmpty() || st.peek() < 0) {
35
36                    st.push(asteroids[i]);
37                }
38            }
39        }
40
41        int[] ans = new int[st.size()];
42
43        for (int i = st.size() - 1; i >= 0; i--) {
44
45            ans[i] = st.pop();
46        }
47
48        return ans;
49    }
50}