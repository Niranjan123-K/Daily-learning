class Solution {
    public String licenseKeyFormatting(String s, int k) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c!='-'){
                st.push(c);
            }
        }
        String res="";
        int count=0;
        int size = 0;
        int stsize = st.size();
        while(!st.isEmpty()){
            char c=st.pop();
             count++;
             size++;
             res = Character.toUpperCase(c)+res;
             if(count==k && size!=stsize){
                res="-"+res;
                count=0;
             }
        }
        return res;
    }
}