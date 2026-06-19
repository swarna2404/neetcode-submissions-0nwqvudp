class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> cur=new ArrayList<>();
    public void backtrack(int[] candidates,int remaining,int i){
        if(remaining==0){
            ans.add(new ArrayList<>(cur));
            return;
        }
        int c=1;
        if(remaining<0|| i==candidates.length)return;
        cur.add(candidates[i]);
        
        for(int j=i+1;j<candidates.length;j++){
            if(candidates[j]==candidates[i])c++;
        }
        backtrack(candidates,remaining-candidates[i],i+1);
        cur.remove(cur.size()-1);
        backtrack(candidates,remaining,i+c);

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates,target,0);
        return ans;
    }
}
