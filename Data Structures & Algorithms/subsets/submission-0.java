class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void backtrack(int i,List<Integer> cur,int[] nums){
        if(i==nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[i]);
        backtrack(i+1,cur,nums);
        cur.remove(cur.size()-1);
        backtrack(i+1,cur,nums);

    }
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0,new ArrayList<>(),nums);
        return ans;
    }
}
