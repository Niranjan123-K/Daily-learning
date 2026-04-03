class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        while(left<nums.length){
            for(int right=0;right<nums.length;right++){
                if(left!=right && (nums[left]+nums[right]==target)){
                    return new int[]{left,right};
                }
            }
            left++;
        }
        return new int[]{};
    }
}