class Solution {
    public int findPeakElement(int[] nums) {
        int max=Integer.MIN_VALUE;
        int in = 0;
        if(nums.length==1) return 0;
        for(int i=0;i<nums.length;i++){
            
            if(i==0){
                if(nums[i]>nums[i+1]){
                    max=max=Math.max(max,nums[i]);
                     in =i;
                }
            }
           else if(i==nums.length-1){
                if(nums[i]>nums[i-1]){
                    max=max=Math.max(max,nums[i]);
                     in =i;
                }
            }
           else if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                max=Math.max(max,nums[i]);
                in =i;
            }
            else continue;
        }
        return in;
    }
}