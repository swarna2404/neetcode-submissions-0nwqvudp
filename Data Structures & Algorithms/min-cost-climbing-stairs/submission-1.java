class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //backward apprach
        int n=cost.length;
        int[]dp=new int[n+1];
        dp[n]=0;
        dp[n-1]=cost[n-1];
        for(int i=n-2;i>=0;i--){
            int one=dp[i+1];
            int two = (i + 2 <= n) ? dp[i + 2] : 0;
            dp[i]=cost[i]+Math.min(one,two);
        }
        return Math.min(dp[0],dp[1]);
        
    }
}
