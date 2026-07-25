class Solution {
    public int maxProduct(int n) {
        List<Integer> li = new ArrayList<>();
        int mul = 1;
        while(n>0){
            int t= n%10;
             li.add(t);
             n/=10;
        }
       Collections.sort(li);
       int a = li.get(li.size()-1);
       int b= li.get(li.size()-2);
       return a*b;
    }
}