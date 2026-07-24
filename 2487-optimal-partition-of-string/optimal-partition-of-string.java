class Solution {
    public int partitionString(String s) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
              if(set.contains(s.charAt(i))){
                count++;
                set.clear();
              }
              
               set.add(s.charAt(i));
        }
        return count+1;
    }
}