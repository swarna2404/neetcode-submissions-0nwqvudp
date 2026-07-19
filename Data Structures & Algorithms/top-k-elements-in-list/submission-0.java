class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int key:map.keySet()){
            int[]arr=new int[2];
            arr[0]=key;
            arr[1]=map.get(key);
            pq.offer(arr);
            if(pq.size()>k)pq.poll();
        }
        int[]ans=new int[k];
        int i=0;
        while(!pq.isEmpty()){
            int[]res=pq.poll();
            ans[i]=res[0];
            i++;
        }
        return ans;
    }
}
