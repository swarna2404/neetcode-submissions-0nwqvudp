class Solution {
    List<List<Integer>>res=new ArrayList<>();
    public void backtrack(int[]nums,int index,List<Integer> cur){
        if(index==nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[index]);
        backtrack(nums,index+1,cur);
        cur.remove(cur.size()-1);
        backtrack(nums,index+1,cur);
    }
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums,0,new ArrayList<>());
        return res;
    }
}
