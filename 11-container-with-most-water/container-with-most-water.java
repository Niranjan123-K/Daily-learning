class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while(left<right){
            int width = Math.abs(left-right);
            int heights = Math.min(height[left],height[right]);
            int con = width*heights;
            max = Math.max(max,con);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}