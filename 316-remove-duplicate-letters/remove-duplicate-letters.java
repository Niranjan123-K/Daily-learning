class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        boolean[] visit = new boolean[26];
        for(char ch:s.toCharArray()){
            count[ch-'a']++;
        }
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            count[ch-'a']--;
            if(visit[ch-'a']==true){
                continue;
            }
            while(!st.isEmpty() && ch<st.peek() && count[st.peek()-'a']>0){
                visit[st.peek()-'a']=false;
                st.pop();
            } 
            st.push(ch);
            visit[ch-'a']=true;
        }
        StringBuilder sb = new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}