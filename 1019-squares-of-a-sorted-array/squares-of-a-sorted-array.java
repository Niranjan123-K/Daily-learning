class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int in = nums.length-1;
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
          int  l = nums[left]*nums[left];
          int r  = nums[right]*nums[right];
          if(l > r){
            res[in] = l;
            in--;
            left++;
          }
          else{
            res[in] = r;
            in--;
            right--;
          }
        }
        return res;
    }
}