class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> words=new HashSet<>(wordDict);
        int len=0;
        for(String word:words){
            len=Math.max(len,word.length());
        }
        int n=s.length();
        boolean[] dp=new boolean[n+1];
        dp[0]=true;
        for(int i=1;i<=n;i++){
            for(int j=i-1;j>=Math.max(0,i-len);j--){
                if(dp[j]&&words.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];

        
    }
}
