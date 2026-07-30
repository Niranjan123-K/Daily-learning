class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
       
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                res[0]=nums[i];
                break;
            }
        }
       LinkedHashSet<Integer> set = new LinkedHashSet<>();
       for(int n:nums){
        set.add(n);
       }
       int i=1;
       for(int j=0;j<nums.length;j++){
           if(!set.contains(i)){
            res[1]=i;
            break;
           }
           else{
            i++;
           }
       }
       return res;
    }
}