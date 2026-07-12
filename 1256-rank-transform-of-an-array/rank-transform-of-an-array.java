class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] neww =  arr.clone();

        Arrays.sort(neww);
        HashMap<Integer,Integer> map = new HashMap<>();
        int j=1;
        for(int n:neww){
            if(!map.containsKey(n)){
            map.put(n,j);
            j++;
            }
        }
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=map.get(arr[i]);
        }
        return res;
    }
}