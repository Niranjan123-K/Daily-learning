class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
    int n = s.length();
    String s1="";
    int st=0;
    int c=0;
    for(int en=0;en<n;en++){
        if(s.charAt(en)=='1'){
             c++;
        }
        while(c>k){
            if(s.charAt(st)=='1'){
                c--;
            }
            st++;
        }
        if(c==k){
             while (s.charAt(st) == '0') {
                    st++;
                }
            String s2=s.substring(st,en+1);
            if(s1.length()==0 ||s1.length()>s2.length() || (s1.length()==s2.length() && s2.compareTo(s1)<0)){
                s1=s2;
            }
            
            }
        }
        return s1;
    }
   
    }
