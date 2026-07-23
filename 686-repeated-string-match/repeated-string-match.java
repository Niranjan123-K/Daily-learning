class Solution {
    public int repeatedStringMatch(String a, String b) {
        String n ="";
        int count=0;
        int yes =0;
        while(yes==0 && n.length()<=(b.length()+a.length())){
           n+=a;
           count++;
           if(n.indexOf(b)!=-1){
               yes=1;
               break;
           }
        }
        if(yes==1){
            return count;
        }
        return -1;
    }
}