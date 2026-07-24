class Solution {
    public String smallestSubsequence(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        HashSet<Character> set=new HashSet<>();
        Stack<Character> st= new Stack<>();

        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                continue;
            }
            while(!st.isEmpty() && s.charAt(i)<st.peek() && map.get(st.peek())>i){
                set.remove(st.pop());
            }
            set.add(s.charAt(i));
            st.push(s.charAt(i));
 
        }
        StringBuilder sb = new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}