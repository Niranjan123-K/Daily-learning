class Solution {
    public int longestSubarray(int[] nums){
          
          int max = 0;
          int zc = 0;
          int st = 0;
          for(int en=0;en<nums.length;en++){
            if(nums[en]==0){
                zc++;
            }   
            while(zc > 1){
                if(nums[st]==0){
                zc--;
                }
                st++;
            }
            max = Math.max(max , en-st);
          }
          return max;
          
  }
}