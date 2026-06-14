class Solution {
    ArrayList<ArrayList<Integer>> adj;
    List<Integer> order;
    public boolean dfs(int num,int[]state){
        state[num]=1;
        for(int neig:adj.get(num)){
            if(state[neig]==0){
                if(dfs(neig,state)){
                    return true;
                }
            }if(state[neig]==1){
                return true;
            }
        }
        state[num]=2;
        order.add(num);
        return false;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        adj=new ArrayList<>();
        order=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
       for(int[] val:prerequisites){
        adj.get(val[1]).add(val[0]);
       }
       int[] state=new int[numCourses];
       for(int i=0;i<numCourses;i++){
        if(state[i]==0){
        if(dfs(i,state))return new int[0];
        }
        
        
    }
    int[]orders=new int[numCourses];
    Collections.reverse(order);
    for(int i=0;i<numCourses;i++){
            orders[i]=order.get(i);
    }
    return orders;
    }
}
