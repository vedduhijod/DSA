1class Solution {
2
3    public long subArrayRanges(int[] nums) {
4
5        return sumMax(nums) - sumMin(nums);
6    }
7
8    // Contribution as maximum
9    private long sumMax(int[] nums) {
10
11        int n = nums.length;
12        long sum = 0;
13
14        Stack<Integer> stack = new Stack<>();
15
16        for (int i = 0; i <= n; i++) {
17
18            while (!stack.isEmpty() &&
19                  (i == n || nums[stack.peek()] < nums[i])) {
20
21                int mid = stack.pop();
22
23                int left = stack.isEmpty() ? -1 : stack.peek();
24                int right = i;
25
26                long count =
27                        (long)(mid - left) * (right - mid);
28
29                sum += (long) nums[mid] * count;
30            }
31
32            stack.push(i);
33        }
34
35        return sum;
36    }
37
38    // Contribution as minimum
39    private long sumMin(int[] nums) {
40
41        int n = nums.length;
42        long sum = 0;
43
44        Stack<Integer> stack = new Stack<>();
45
46        for (int i = 0; i <= n; i++) {
47
48            while (!stack.isEmpty() &&
49                  (i == n || nums[stack.peek()] > nums[i])) {
50
51                int mid = stack.pop();
52
53                int left = stack.isEmpty() ? -1 : stack.peek();
54                int right = i;
55
56                long count =
57                        (long)(mid - left) * (right - mid);
58
59                sum += (long) nums[mid] * count;
60            }
61
62            stack.push(i);
63        }
64
65        return sum;
66    }
67}