class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            q.offer(stones[i]);
        }
        while(q.size()>1){
            int y = q.poll();
            int x = q.poll();

            if(x!=y){
                q.offer(y-x);
            }
        }
        if(q.size()==1) return q.peek();
        else return 0;
    }
}