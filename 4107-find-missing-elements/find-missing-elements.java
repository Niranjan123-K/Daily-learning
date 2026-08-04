class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
            min = Math.min(min,n);
            max = Math.max(max,n);
        }
        Arrays.sort(nums);
        List<Integer> li = new ArrayList<>();
        int len =1;
        while(min<=max){
           if(!set.contains(min)){
            li.add(min);
           }
           min++;
        }
       return li;
    }
}