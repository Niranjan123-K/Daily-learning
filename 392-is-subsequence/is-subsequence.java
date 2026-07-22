class Solution {
    public boolean isSubsequence(String s, String t) {
        int count=0;
        int in=0;
        if(s.length()<=0) return true;
        for(int i=0;i<t.length();i++){
            if(in<s.length()){
           if((t.charAt(i)==s.charAt(in))){
            in++;
            count++;
           }
           
           }
        }
        if(count==s.length()) return true;
        return false;
           
    }
}