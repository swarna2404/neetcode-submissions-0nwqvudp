class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones)heap.offer(num);
        while(heap.size()>1){
            int p1=heap.poll();
            int p2=heap.poll();
            if(p1>p2)heap.offer(p1-p2);
        }
        if(heap.size()==1)return heap.peek();
        return 0;
    }
}
