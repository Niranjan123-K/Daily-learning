class Solution {
    public int maxVowels(String s, int k) {
        int st = 0;
        int max = 0;
        int count=0;
    
        for(int en=0;en<s.length();en++){
            char c = s.charAt(en);
            if(c=='a' || c=='e'|| c=='i'|| c=='o' || c=='u'){
              count++;
            }
            while(en-st+1 > k){
                char c1 = s.charAt(st);
                if(c1=='a' || c1=='e'|| c1=='i'|| c1=='o' || c1=='u'){
                    count--;
                }
                st++;
            }
            max = Math.max(max,count);
        }
        return max;
        
    }
}