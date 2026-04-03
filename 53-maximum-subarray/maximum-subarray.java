class Solution {
    public int maxSubArray(int[] nums) {
       int cursum = nums[0];
       int larsum = nums[0];

       for(int i=1;i<nums.length;i++){
        cursum = Math.max(nums[i] , cursum+ nums[i]);
        larsum = Math.max(cursum , larsum);  
       }
       return larsum;
    }
}