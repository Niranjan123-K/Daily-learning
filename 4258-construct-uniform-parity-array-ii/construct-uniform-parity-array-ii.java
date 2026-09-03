class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=Integer.MAX_VALUE;
        int e=0;
        for(int n:nums1){
           min = Math.min(min,n);
           if(n%2==0){
            e++;
           }
        }
        if(e==nums1.length) return true;
        if(min%2==0){
            return false;
        }
        int[] nums2=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]!=min && nums1[i]%2==0){
                nums2[i]= nums1[i]-min;
            }
            else{
            nums2[i]=nums1[i];
            }
        }
        int c=0;
        for(int n:nums2){
           if(n%2!=0){
            c++;
           }
        }
        if(c==nums2.length) return true;
        return false;

    }
}