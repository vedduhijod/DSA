1class Solution {
2    public int majorityElement(int[] nums) {
3        int cnt = 0;
4        int el = 0;
5        for(int i = 0; i < nums.length; i++){
6            if(cnt == 0){
7                cnt = 1;
8                el = nums[i];
9            }
10            else if(nums[i] == el){
11                cnt++;
12            }
13            else {
14                cnt--;
15            }
16        }
17        return el;
18    }
19
20    }