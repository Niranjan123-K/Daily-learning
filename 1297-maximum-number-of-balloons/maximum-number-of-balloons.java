class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c:text.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        map.put('l' , map.getOrDefault('l',0)/2);
        map.put('o' , map.getOrDefault('o',0)/2);

        char[] cr={'b' ,'a','l' ,'o' , 'n'};  
        int len=Integer.MAX_VALUE;
        for(char ch: cr){
            if(!map.containsKey(ch)){
                return 0;
              
            }
            len=Math.min(len , map.get(ch));
        }
        return len;
    }
}

