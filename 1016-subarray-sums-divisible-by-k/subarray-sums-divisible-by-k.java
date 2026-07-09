class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);

        int sum = 0;
        int count = 0;

        for(int num : nums){
            sum += num;
            int rem = sum % k;
            if(rem < 0){
                rem = rem + k; 
            }
            count = count + freq.getOrDefault(rem, 0);
             freq.put(rem, freq.getOrDefault(rem, 0) + 1);
        }
        
        return count;
    }
}