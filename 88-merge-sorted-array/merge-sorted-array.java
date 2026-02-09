class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int[] arr = new int[nums1.length];
        int index = 0;

        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                arr[index] = nums1[i];
                index++;
                i++;
            }else {
                arr[index] = nums2[j];
                index++;
                j++;
            }
        }
        while(i < m){
            arr[index] = nums1[i];
                index++;
                i++;
        }

                while(j < n){
            arr[index] = nums2[j];
                index++;
                j++;
        }
        for(int a=0; a<nums1.length;a++){
        nums1[a] = arr[a];
    }


    }
}