class Solution {
    List<List<Integer>> ans=new ArrayList<>();
     List<Integer> cur=new ArrayList<>();
    public void backtrack(int []nums,int remaining,int i){
        //base case
        if(remaining==0){
            ans.add(new ArrayList<>(cur));
            return;
        }
        //invalid cases
        if(remaining<0||i==nums.length)return;
        //choice 1: include element
        cur.add(nums[i]);
        backtrack(nums,remaining-nums[i],i);
        cur.remove(cur.size()-1);
        //choice 2:exclude
        backtrack(nums,remaining,i+1);

    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backtrack(nums,target,0);
        return ans;
    }
}
