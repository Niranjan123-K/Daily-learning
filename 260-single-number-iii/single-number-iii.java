class Solution {
    public int[] singleNumber(int[] nums) {
       LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int c=0;
        int[] arr = new int[2];
        
        for(int n2:nums){
            if(c<2 && map.get(n2)==1){
                arr[c++]=n2;
            }
        }
        return arr;
    }
}