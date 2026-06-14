class Solution {
    ArrayList<ArrayList<Integer>> adj;
    public void dfs(int num,boolean[]visited){
        visited[num]=true;
        for(int nei:adj.get(num)){
            if(!visited[nei]){
                dfs(nei,visited);
            }
        }
    }
    public int countComponents(int n, int[][] edges) {
        adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int []val:edges){
            adj.get(val[0]).add(val[1]);
            adj.get(val[1]).add(val[0]);
        }
        boolean[] visited=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                dfs(i,visited);
            }
        }
        return count;

    }
}
