class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(c1.length!=c2.length) return false;
        int n=c1.length;
        for(int i=0;i<n;i++){
            if(c1[i]!=c2[i]){
                return false;
                
            }
            continue;
        }return true;
       
    }
}