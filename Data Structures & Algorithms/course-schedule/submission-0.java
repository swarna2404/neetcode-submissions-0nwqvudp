class Solution { 
     ArrayList<ArrayList<Integer>> adj;
    public boolean dfs(int num,int[] state){
        state[num]=1;
        for(int nei:adj.get(num)){
            if(state[nei]==1){
                return true;
            }
            if(state[nei]==0){
                if(dfs(nei,state)){
                    return true;
                }
            }
        }
        state[num]=2;
        return false;

    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
       for(int[] val:prerequisites){
        adj.get(val[1]).add(val[0]);
       }
       int[] state=new int[numCourses];
       for(int i=0;i<numCourses;i++){
        if(state[i]==0){
        if(dfs(i,state))return false;
        }
        
    }return true;
}
}
