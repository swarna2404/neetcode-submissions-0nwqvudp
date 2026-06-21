class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> cur=new ArrayList<>();
    public void backtrack(int[] nums,int i){
        if(i==nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        int k=1;
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]==nums[i])k++;
        }
        cur.add(nums[i]);
        backtrack(nums,i+1);
        cur.remove(cur.size()-1);
        backtrack(nums,i+k);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums,0);
        return ans;
    }
}
