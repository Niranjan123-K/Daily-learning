class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
 
      for(int i=0;i<nums.length;i++){
        if(l1.size()==0 && i==0) l1.add(nums[i]);
       else if(l2.size()==0 && i==1) l2.add(nums[i]);
       else{
        if(l1.get(l1.size()-1)> l2.get(l2.size()-1)){
            l1.add(nums[i]);
        }
        else{
            l2.add(nums[i]);
        }
       }
      }
      int in=0;
    for(int i=0;i<l1.size();i++){
        nums[in++]=l1.get(i);
    }
    for(int i=0;i<l2.size();i++){
        nums[in++]=l2.get(i);
    }
    return nums;
    }
}