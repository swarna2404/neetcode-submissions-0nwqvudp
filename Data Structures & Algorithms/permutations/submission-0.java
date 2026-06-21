class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> cur=new ArrayList<>();
    boolean[] seen;
    public void backtrack(int[]nums){
        if(nums.length==cur.size()){
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if (seen[i])continue;
            seen[i]=true;
            cur.add(nums[i]);
            backtrack(nums);
            cur.remove(cur.size()-1);
            seen[i]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        seen=new boolean[nums.length];
        backtrack(nums);
        return ans;
    }
}
