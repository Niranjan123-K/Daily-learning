class Solution {
    public int trap(int[] height) {
        Stack<Integer> st = new Stack<>();
        int n = height.length;
        st.push(height[n-1]);
        for(int i=n-2;i>=2;i--){
            st.push(Math.max(st.peek() , height[i]));
        }
        int leftmax = height[0];
        int water=0;
        for(int i=1;i<n-1;i++){
            int minHeight = Math.min(st.peek(),leftmax);
            water = water+Math.max(0,minHeight-height[i]);
            st.pop();
            leftmax = Math.max(leftmax,height[i]);
        }
        return water;
    }
}