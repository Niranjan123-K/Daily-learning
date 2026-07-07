class Solution {
    public long sumAndMultiply(int n) {
        String s=String.valueOf(n);
       if(n==0) return 0;
        String x="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                x+=s.charAt(i);
            }
        }
        long sum = 0;
        for(int i=0;i<x.length();i++){
                sum=sum+(x.charAt(i)-'0');
        }
       int num = Integer.parseInt(x);
       return (long)(num*sum);

    }
}