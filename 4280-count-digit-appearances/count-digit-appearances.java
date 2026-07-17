class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
       // HashMap<Integer,Integer> map = new HashMap<>();
       String s = "";
       int count =0;
        for(int i=0;i<nums.length;i++){
           s+=nums[i];
        }
        for(char c:s.toCharArray()){
            if(c-'0' == digit){
                count++;
            }
        }
        return count;
    }
}