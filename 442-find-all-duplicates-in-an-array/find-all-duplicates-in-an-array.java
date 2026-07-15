class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> li = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(!set.contains(nums[i])){
            if(nums[i]==nums[i+1]){
                li.add(nums[i]);
                set.add(nums[i]);
            }
            }
        }
        return li;
    }
}