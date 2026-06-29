class Solution {
    PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
    public int lastStoneWeight(int[] stones) {
        for(int num:stones)heap.offer(num);
        while(heap.size()>1){
            int x=heap.poll();
            int y=heap.poll();
            if(x>y)heap.offer(x-y);
        }
        if(heap.size()==1)return heap.peek();
        return 0;
    }
}
