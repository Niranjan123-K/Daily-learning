class Solution {
    public int longestOnes(int[] nums, int k) {
       int c=0;
       int fc=0;
       int max = Integer.MIN_VALUE;
       int st=0;
       for(int en = 0;en<nums.length;en++){
        if(nums[en]==1){
            c++;
        }
        else{
            c++;
            fc++;
        }
        while(fc > k){
            if(nums[st]==1){
                c--;
            }
            else{
                c--;
                fc--;
            }
            st++;
        }
        max = Math.max(max , en-st+1);
       }
       return max;
    }
}