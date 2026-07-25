class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        dp[0]=nums[0];
        //dp[1]=Math.max(nums[0],nums[1]);
        for(int i=1;i<n;i++){
            int skip=dp[i-1];
            int noSkip=(i-2)<0?0:dp[i-2];
            dp[i]=Math.max(nums[i]+noSkip,skip);
        }
        return dp[n-1];
        
    }
}
