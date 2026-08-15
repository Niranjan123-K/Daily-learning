class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int st = 0;
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int en=0;en<nums.length;en++){
           map.put(nums[en],map.getOrDefault(nums[en],0)+1);

           while(map.get(nums[en])>k){
            map.put(nums[st],map.get(nums[st])-1);
            if(map.get(nums[st])==0){
                map.remove(nums[st]);
            }
            st++;
           }
           max = Math.max(max,en-st+1);
        }
        return max;
    }
}