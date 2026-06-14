class Solution {
    ArrayList<ArrayList<Integer>> adj;
    public void dfs(int num,boolean[]state){
        state[num]=true;
        for(int nei:adj.get(num)){
            if(!state[nei]){
                dfs(nei,state);
            }
        }
    }
    public boolean validTree(int n, int[][] edges) {
        adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
       for(int[] val:edges){
        adj.get(val[1]).add(val[0]);
        adj.get(val[0]).add(val[1]);
       }
        if(edges.length!=n-1)return false;
        boolean[]state=new boolean[n];
        dfs(0,state);
        for (int i = 0; i < n; i++) {
            if (!state[i]) return false;
        }
        return true;

    }
}
