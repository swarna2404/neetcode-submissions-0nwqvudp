class Solution {
    public int[] getConcatenation(int[] nums) {
        int m=nums.length;
        int[]ans=new int[2*m];
        for(int i=0;i<nums.length;i++){
            ans[i+m]=nums[i];
            ans[i]=nums[i];
        }
        return ans;
    }
}