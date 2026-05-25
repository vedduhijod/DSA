1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3
4        Arrays.sort(nums);
5        int n = nums.length;
6
7        List<List<Integer>> result = new ArrayList<>();
8
9        for (int i = 0; i < n - 3; i++) {
10
11            if (i > 0 && nums[i] == nums[i - 1]) {
12                continue;
13            }
14
15            for (int j = i + 1; j < n - 2; j++) {
16
17                if (j > i + 1 && nums[j] == nums[j - 1]) {
18                    continue;
19                }
20
21                int left = j + 1;
22                int right = n - 1;
23
24                while (left < right) {
25
26                    long sum = (long) nums[i]
27                             + nums[j]
28                             + nums[left]
29                             + nums[right];
30
31                    if (sum == target) {
32
33                        result.add(Arrays.asList(
34                            nums[i],
35                            nums[j],
36                            nums[left],
37                            nums[right]
38                        ));
39
40                        left++;
41                        right--;
42
43                        // Skip duplicates
44                        while (left < right &&
45                               nums[left] == nums[left - 1]) {
46                            left++;
47                        }
48
49                        while (left < right &&
50                               nums[right] == nums[right + 1]) {
51                            right--;
52                        }
53
54                    } else if (sum < target) {
55                        left++;
56                    } else {
57                        right--;
58                    }
59                }
60            }
61        }
62
63        return result;
64    }
65}