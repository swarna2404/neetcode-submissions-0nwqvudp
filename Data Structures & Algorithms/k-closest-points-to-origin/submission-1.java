class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]>heap=new PriorityQueue<>((a,b)->((b[1]*b[1]+b[0]*b[0])-(a[1]*a[1]+a[0]*a[0])));
        for(int[]num:points){
            heap.offer(num);
            if(heap.size()>k)heap.poll();
        }
        int[][] arr=new int[k][2];
        for(int i=0;i<k;i++){
            arr[i]=heap.peek();
            heap.poll();
        }return arr;

    }
}
