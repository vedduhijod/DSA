1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int i = 0;
4        int j = 0;
5        int[] arr = new int[nums1.length];
6        int index = 0;
7
8        while(i < m && j < n){
9            if(nums1[i] <= nums2[j]){
10                arr[index] = nums1[i];
11                index++;
12                i++;
13            }else {
14                arr[index] = nums2[j];
15                index++;
16                j++;
17            }
18        }
19        while(i < m){
20            arr[index] = nums1[i];
21                index++;
22                i++;
23        }
24
25                while(j < n){
26            arr[index] = nums2[j];
27                index++;
28                j++;
29        }
30        for(int a=0; a<nums1.length;a++){
31        nums1[a] = arr[a];
32    }
33
34
35    }
36}