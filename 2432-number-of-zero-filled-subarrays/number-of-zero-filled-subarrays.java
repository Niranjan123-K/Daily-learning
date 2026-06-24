class Solution {
    public long zeroFilledSubarray(int[] nums) {
             long sum =0;
             long count=0;
             for(int num:nums){
                if(num!=0){
                    count=0;
                    
                }
                if(num==0){
                    count++;
                }
                sum+=count;
             }
       return sum;

        // int sum=0;
        // for(int i=1;i<=nums.length;i++){
        //     int count = 0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[j]==0){
        //             count++;
        //         }
        //         if(nums[j]!=0) count=0;
        //         if(count>=i){
        //             sum+=1;
                    
        //         }
                
                
        //     }
        // }
        // return sum;
    }
}